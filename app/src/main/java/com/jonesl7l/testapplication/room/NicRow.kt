package com.jonesl7l.testapplication.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * An instance of Nic represents a row in the Nic table in the app's database
 */

@Entity(tableName = "Nic")
data class NicRow(
    @PrimaryKey @ColumnInfo(name = NIC_TABLE_NAME) val name: String,
    @ColumnInfo(name = NIC_TABLE_POWER_LEVEL) val powerLevel: Int,
    @ColumnInfo(name = NIC_TABLE_IMAGE) val image: String
) {
    companion object {
        const val NIC_TABLE_NAME = "name"
        const val NIC_TABLE_POWER_LEVEL = "powerLevel"
        const val NIC_TABLE_IMAGE = "image"
    }
}