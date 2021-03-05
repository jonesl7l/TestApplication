package com.jonesl7l.testapplication.room

import com.jonesl7l.testapplication.helpers.CoroutinesHelper
import kotlinx.coroutines.withContext

object AppDatabaseHelper {

    private val nicDao: NicDao by lazy { AppDatabase.instance().nicDao() }

    suspend fun insert(nic: NicRow) {
        withContext(CoroutinesHelper.ioDispatcher) {
            nicDao.insert(nic)
        }
    }

    suspend fun getAllNics(): List<NicRow> {
        return withContext(CoroutinesHelper.ioDispatcher) {
            val result = nicDao.getAllNics()
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