package com.jonesl7l.testapplication.coroutines

import androidx.lifecycle.lifecycleScope
import com.jonesl7l.testapplication.adapter.AdapterItemInterface
import com.jonesl7l.testapplication.genericnics.NicFragment
import com.jonesl7l.testapplication.helpers.CoroutinesHelper
import com.jonesl7l.testapplication.helpers.NetworkCallHelper
import com.jonesl7l.testapplication.retrofit.NicService
import com.jonesl7l.testapplication.room.AppDatabaseHelper
import com.jonesl7l.testapplication.room.NicRow
import com.jonesl7l.testapplication.viewmodels.Nic
import com.jonesl7l.testapplication.viewmodels.Nics
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import timber.log.Timber
import kotlin.random.Random

class CoroutinesFragment : NicFragment(), AdapterItemInterface {

    //region AdapterItemInterface

    override fun onItemClick(tag: String, value: Any?) {
        when (tag) {
            RETROFIT_GET_TAG -> suspendedCoroutineScopeFetchNics()
            ROOM_INSERT_RANDOM_TAG -> suspendedCoroutineInsertRandomNic()
            ROOM_DELETE_ALL_NICS_TAG -> suspendedCoroutineDeleteAllNics()
        }
    }

    //endregion

    //region Coroutines

    /**
     * CoroutineScope It is defined a simple factory function that takes CoroutineContexts as arguments to create wrapper
     * around the combined CoroutineContext and creates a Job element if the provide context does not have one already.
     */
    private fun suspendedCoroutineScopeFetchNics() {
        //Get a Retrofit builder instance
        val service = NetworkCallHelper.getDataRetrofitService("http://192.168.1.88:3000/", NicService::class.java)
        //Do the initial call on the IO thread; network calls should be handled here
        //apparently Retrofit is thread safe but https://medium.com/android-news/kotlin-coroutines-and-retrofit-e0702d0b8e8f says do it this way
        CoroutineScope(CoroutinesHelper.ioDispatcher).launch {
            // LoadNics is a 'suspended' method
            // We have to wrap any suspended functions inside a coroutine(CoroutineScope in this case) or another suspended function
            val response = service.suspendedLoadNics()
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
        GlobalScope.launch {
            AppDatabaseHelper.insert(nic)
            val result = AppDatabaseHelper.getAllNics()
            val newNicObject = Nics(mutableListOf())
            result.forEach { newNicObject.nics.add(Nic(it.name, it.powerLevel, it.image)) }
            withContext(CoroutinesHelper.mainDispatcher) {
                displayNics(newNicObject)
            }
        }
    }

    /**
     * LifecycleScope is an extension for LifeCycleOwner and bound to Activity or Fragment's lifCycle where scope is canceled when that Activity or Fragment is destroyed.
     * This has specific methods for launching on onStart, onResume
     */
    private fun suspendedCoroutineDeleteAllNics() {
        //This would be cancelled if the activity/fragment was destroyed
        lifecycleScope.launch {
            AppDatabaseHelper.deleteAllNics()
            withContext(CoroutinesHelper.mainDispatcher) {
                displayNics(Nics(mutableListOf()))
            }
        }
    }

    //endregion

    companion object {

        fun instance(): CoroutinesFragment = CoroutinesFragment()
    }
}