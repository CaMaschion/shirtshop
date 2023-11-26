package com.maschion.shirtshop.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.maschion.shirtshop.utils.Converters

@Database(entities = [LocalClient::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class ClientDatabase: RoomDatabase() {
    abstract fun clientDao(): ClientDao
}
