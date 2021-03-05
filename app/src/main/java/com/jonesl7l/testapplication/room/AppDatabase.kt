package com.jonesl7l.testapplication.room

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.jonesl7l.testapplication.appContext

/**
 * This class will hold the database. It defines the database configuration and serves as the app's main access point to the persistent data.
 */
@Database(entities = [NicRow::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun nicDao(): NicDao

    companion object {

        fun instance(): AppDatabase = Room.databaseBuilder(appContext(), AppDatabase::class.java, "nic_database").build()
    }
}