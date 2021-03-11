package com.jonesl7l.testapplication.genericnics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jonesl7l.testapplication.R
import com.jonesl7l.testapplication.adapter.AdapterItemInterface
import com.jonesl7l.testapplication.adapter.GenericAdapter
import com.jonesl7l.testapplication.adapter.NicAdapter
import com.jonesl7l.testapplication.coroutines.CoroutinesFragment
import com.jonesl7l.testapplication.databinding.FragmentBaseBinding
import com.jonesl7l.testapplication.viewmodels.GenericItem
import com.jonesl7l.testapplication.viewmodels.Nics

abstract class NicFragment : Fragment(), AdapterItemInterface {

    private var fragmentBinding: FragmentBaseBinding? = null

    private var genericAdapter: GenericAdapter? = null

    private var nicAdapter: NicAdapter? = null
    protected var nicsInstance: Nics = Nics(mutableListOf())

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
        //override
    }

    //endregion

    //region Init

    private fun setAdapter() {
        genericAdapter = GenericAdapter(
            listOf(
                GenericItem(getString(R.string.suspended_network), tag = RETROFIT_GET_TAG, type = GenericAdapter.GenericItemType.BUTTON),
                GenericItem(getString(R.string.suspended_database_insert), tag = ROOM_INSERT_RANDOM_TAG, type = GenericAdapter.GenericItemType.BUTTON),
                GenericItem(getString(R.string.suspended_database_delete_all), tag = ROOM_DELETE_ALL_NICS_TAG, type = GenericAdapter.GenericItemType.BUTTON)
            ), this
        )
        nicAdapter = NicAdapter(nicsInstance.nics)

        fragmentBinding?.fragmentBaseButtonRecycler?.adapter = genericAdapter
        fragmentBinding?.fragmentBaseDataRecycler?.adapter = nicAdapter
    }

    protected fun displayNics(nics: Nics) {
        nicAdapter?.updateDataSet(nics.nics)
    }

    //endregion

    companion object {

        const val RETROFIT_GET_TAG = "retro get"
        const val ROOM_INSERT_RANDOM_TAG = "room insert random"
        const val ROOM_DELETE_NIC_TAG = "room delete nic"
        const val ROOM_DELETE_ALL_NICS_TAG = "room delete all nics"
    }
}