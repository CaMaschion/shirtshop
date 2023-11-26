package com.maschion.shirtshop.data.source.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.maschion.shirtshop.data.source.local.LocalClient
import kotlinx.coroutines.flow.Flow

@Dao
interface ClientDao {

    @Query("SELECT * FROM client_table ORDER BY id ASC")
    fun getAllClients(): Flow<List<LocalClient>>

    @Query("SELECT * FROM client_table WHERE id=:clientId")
    fun getSelectedClient(clientId: Int): Flow<LocalClient>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addClient(localClient: LocalClient)

    @Update
    suspend fun updateClient(localClient: LocalClient)

    @Delete
    suspend fun deleteClient(localClient: LocalClient)

    @Query("DELETE FROM client_table")
    suspend fun deleteAllClient()

    @Query("SELECT * FROM client_table WHERE name LIKE :searchQuery")
    fun searchDatabase(searchQuery: String): Flow<List<LocalClient>>

}