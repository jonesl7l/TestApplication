package com.jonesl7l.testapplication.coroutines

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jonesl7l.testapplication.R
import com.jonesl7l.testapplication.adapter.AdapterItemInterface
import com.jonesl7l.testapplication.adapter.GenericAdapter
import com.jonesl7l.testapplication.adapter.NicAdapter
import com.jonesl7l.testapplication.databinding.FragmentBaseBinding
import com.jonesl7l.testapplication.helpers.CoroutinesHelper
import com.jonesl7l.testapplication.helpers.NetworkCallHelper
import com.jonesl7l.testapplication.retrofit.NicService
import com.jonesl7l.testapplication.viewmodels.GenericItem
import com.jonesl7l.testapplication.viewmodels.Nics
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import timber.log.Timber
import java.lang.Exception

class CoroutinesFragment : Fragment(), AdapterItemInterface {

    private var fragmentBinding: FragmentBaseBinding? = null

    private var genericAdapter: GenericAdapter? = null
    private val dataList: MutableList<GenericItem> = mutableListOf()

    private var nicAdapter: NicAdapter? = null
    private var nicsInstance: Nics = Nics(mutableListOf())

    //region Fragment

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        fragmentBinding = FragmentBaseBinding.inflate(layoutInflater, container, false)
        return fragmentBinding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setAdapter()
    }

    override fun onDestroy() {
        super.onDestroy()
        fragmentBinding = null
    }

    //endregion

    //region AdapterItemInterface

    override fun onItemClick(tag: String, value: Any?) {
        when (tag) {
            SUSPEND_TAG -> suspendedFetchNics()
        }
    }

    //endregion

    private fun setAdapter() {
        genericAdapter = GenericAdapter(listOf(GenericItem(getString(R.string.suspended_network), tag = SUSPEND_TAG, type = GenericAdapter.GenericItemType.BUTTON)), this)
        nicAdapter = NicAdapter(nicsInstance.nics)

        fragmentBinding?.fragmentBaseButtonRecycler?.adapter = genericAdapter
        fragmentBinding?.fragmentBaseDataRecycler?.adapter = nicAdapter
    }

    private fun suspendedFetchNics() {
        //Get a Retrofit builder instance
        val service = NetworkCallHelper.getDataRetrofitService("http://192.168.1.88:3000/getNics/", NicService::class.java)
        //Do the initial call on the IO thread; network calls should be handled here
        //apparently Retrofit is thread safe but https://medium.com/android-news/kotlin-coroutines-and-retrofit-e0702d0b8e8f says do it this way
        CoroutineScope(CoroutinesHelper.ioDispatcher).launch {
            // LoadNics is a 'suspend' method
            val response = service.loadNics()
            //Once we have a response update the UI on the main thread
            //If we used default or io here the UI wouldn't until further user interaction
            withContext(CoroutinesHelper.mainDispatcher) {
                try {
                    if (response.isSuccessful) {
                        response.body()?.let { displayNics(it) }
                    } else {
                        Timber.e("suspendedFetchNics unsuccessful: ${response.errorBody()}")
                    }
                } catch (exception: Exception) {
                    Timber.e(exception)
                }
            }
        }
    }

    private fun displayNics(nics: Nics) {
        nicAdapter?.updateDataSet(nics.nics)
    }

    companion object {

        const val SUSPEND_TAG = "suspend"
        const val GLOBAL_SCOPE_TAG = "global"
        const val ASYNC_TAG = "async"
        const val AWAIT_TAG = "await"
        const val DISPATCHER_TAG = "dispatcher"

        fun instance(): CoroutinesFragment = CoroutinesFragment()
    }
}