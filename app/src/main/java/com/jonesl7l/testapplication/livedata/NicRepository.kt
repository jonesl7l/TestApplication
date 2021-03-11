package com.jonesl7l.testapplication.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.jonesl7l.testapplication.helpers.CoroutinesHelper
import com.jonesl7l.testapplication.helpers.NetworkCallHelper
import com.jonesl7l.testapplication.retrofit.NicService
import com.jonesl7l.testapplication.viewmodels.Nics
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import timber.log.Timber

class NicRepository {

    private val nicService: NicService = NetworkCallHelper.getDataRetrofitService("http://192.168.1.88:3000/", NicService::class.java)

    /**
     * CoroutineScope It is defined a simple factory function that takes CoroutineContexts as arguments to create wrapper
     * around the combined CoroutineContext and creates a Job element if the provide context does not have one already.
     */
    fun getNicsList(): MutableLiveData<Nics> {
        val data = MutableLiveData<Nics>()
        //Get a Retrofit builder instance

        //Do the initial call on the IO thread; network calls should be handled here
        //apparently Retrofit is thread safe but https://medium.com/android-news/kotlin-coroutines-and-retrofit-e0702d0b8e8f says do it this way
        CoroutineScope(CoroutinesHelper.ioDispatcher).launch {
            // LoadNics is a 'suspended' method
            // We have to wrap any suspended functions inside a coroutine(CoroutineScope in this case) or another suspended function
            val response = nicService.suspendedLoadNics()
            try {
                if (response.isSuccessful) {
                    withContext(CoroutinesHelper.mainDispatcher) {
                        data.value = response.body()
                    }
                } else {
                    Timber.e("suspendedFetchNics unsuccessful: ${response.errorBody()}")
                }
            } catch (exception: Exception) {
                Timber.e(exception)
            }
        }
        return data
    }
}