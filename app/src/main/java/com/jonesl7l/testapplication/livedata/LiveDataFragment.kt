package com.jonesl7l.testapplication.livedata

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.lifecycleScope
import com.jonesl7l.testapplication.adapter.AdapterItemInterface
import com.jonesl7l.testapplication.genericnics.NicFragment
import com.jonesl7l.testapplication.helpers.CoroutinesHelper
import com.jonesl7l.testapplication.room.AppDatabaseHelper
import com.jonesl7l.testapplication.room.NicRow
import com.jonesl7l.testapplication.viewmodels.Nic
import com.jonesl7l.testapplication.viewmodels.Nics
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.random.Random

class LiveDataFragment : NicFragment(), AdapterItemInterface {

    private lateinit var viewModel: NicsViewModel

    //region Fragment

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(NicsViewModel::class.java)
        observeViewModel(viewModel)
    }

    //endregion

    //region AdapterItemInterface

    override fun onItemClick(tag: String, value: Any?) {
        when (tag) {
            ROOM_INSERT_RANDOM_TAG -> suspendedCoroutineInsertRandomNic()
            ROOM_DELETE_ALL_NICS_TAG -> suspendedCoroutineDeleteAllNics()
        }
    }

    //endregion

    //region Live Data

    private fun observeViewModel(viewModel: NicsViewModel) {
        viewModel.nicsObservable.observe(this, Observer<Nics?> { nics ->
            if (nics != null) {
                displayNics(nics)
            }
        })
    }

    /**
     * GlobalScope is alive as long as you app is alive, if you doing some counting for instance in this scope and rotate your device it will continue the task/process.
     * Shouldn't be used in Activity; safe for calls in Application class
     */
    private fun suspendedCoroutineInsertRandomNic() {
        val nicNum = Random.nextInt(nicsInstance.nics.size, 99999)
        val nicFirstImageParam = Random.nextInt(25, 75)
        val nicSecondImageParam = Random.nextInt(25, 75)

        val name = "nic$nicNum"
        val nicPowerLevel = Random.nextInt(0, 10000)
        val image = "https://www.placecage.com/$nicFirstImageParam/$nicSecondImageParam"

        val nic = NicRow(name, nicPowerLevel, image)

        //This should really be CoroutineScope but for demo here we are
        CoroutineScope(CoroutinesHelper.ioDispatcher).launch {
            AppDatabaseHelper.insert(nic)
            val result = AppDatabaseHelper.getAllNics()
            val newNicObject = Nics(mutableListOf())
            result.forEach { newNicObject.nics.add(Nic(it.name, it.powerLevel, it.image)) }
            withContext(CoroutinesHelper.mainDispatcher) {
                viewModel.nicsObservable.value = newNicObject
            }
        }
    }

    private fun suspendedCoroutineDeleteAllNics() {
        //This would be cancelled if the activity/fragment was destroyed
        CoroutineScope(CoroutinesHelper.ioDispatcher).launch {
            AppDatabaseHelper.deleteAllNics()
            withContext(CoroutinesHelper.mainDispatcher) {
                viewModel.nicsObservable.value = Nics(mutableListOf())
            }
        }
    }

    //endregion

    companion object {

        fun instance(): LiveDataFragment = LiveDataFragment()
    }
}