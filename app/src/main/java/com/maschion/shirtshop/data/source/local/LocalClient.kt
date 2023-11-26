package com.maschion.shirtshop.data.source.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.maschion.shirtshop.utils.Constants.DATABASE_TABLE
import java.util.Date

@Entity(tableName = DATABASE_TABLE)
data class LocalClient(
    @PrimaryKey(autoGenerate = true)
    val id:Int = 0,
    var name: String,
    var birthday: Date,
    var email: String,
    var phone: String,
    var address: String,
    var serviceDate: String,
    val serviceLocal: String,
    val fabric: String
)