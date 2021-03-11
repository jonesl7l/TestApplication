package com.jonesl7l.testapplication.room

import androidx.lifecycle.MutableLiveData
import com.jonesl7l.testapplication.helpers.CoroutinesHelper
import com.jonesl7l.testapplication.viewmodels.Nic
import com.jonesl7l.testapplication.viewmodels.Nics
import kotlinx.coroutines.withContext

object AppDatabaseHelper {

    private val nicDao: NicDao by lazy { AppDatabase.instance().nicDao() }

    val liveNics = MutableLiveData<Nics>()

    suspend fun insert(nic: NicRow) {
        withContext(CoroutinesHelper.ioDispatcher) {
            nicDao.insert(nic)
            liveNics.value?.nics?.add(Nic(nic.name, nic.powerLevel, nic.image))
        }
    }

    suspend fun getAllNics(): List<NicRow> {
        return withContext(CoroutinesHelper.ioDispatcher) {
            val result = nicDao.getAllNics()
            liveNics.value?.nics?.clear()
            result.forEach {
                liveNics.value?.nics?.add(Nic(it.name, it.powerLevel, it.image))
            }
            result
        }
    }

    suspend fun delete(name: String) {
        withContext(CoroutinesHelper.ioDispatcher) {
            nicDao.delete(name)
        }
    }

    suspend fun deleteAllNics() {
        withContext(CoroutinesHelper.ioDispatcher) {
            nicDao.deleteAllNics()
        }
    }
}