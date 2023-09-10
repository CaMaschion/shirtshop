package com.maschion.shirtshop.data.client

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.maschion.shirtshop.data.ClientDao
import com.maschion.shirtshop.utils.Converters

@Database(entities = [Client::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class ClientDatabase: RoomDatabase() {

    abstract fun clientDao(): ClientDao
}
