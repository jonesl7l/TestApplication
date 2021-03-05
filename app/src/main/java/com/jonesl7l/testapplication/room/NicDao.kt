package com.jonesl7l.testapplication.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.jonesl7l.testapplication.room.NicRow.Companion.NIC_TABLE_NAME

/**
 * Data Access Object; provides methods that the rest of the app uses to interact with data in the Nic table
 */
@Dao
interface NicDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(nic: NicRow)

    @Query("DELETE FROM Nic WHERE $NIC_TABLE_NAME = :name")
    suspend fun delete(name: String)

    @Query("SELECT * FROM Nic")
    suspend fun getAllNics(): List<NicRow>

    @Query("DELETE FROM Nic")
    suspend fun deleteAllNics()
}