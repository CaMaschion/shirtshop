package com.maschion.shirtshop.data.client

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Client::class], version = 1, exportSchema = false)
abstract class ClientDatabase: RoomDatabase(){

    abstract fun client(): Client
}
