package com.maschion.shirtshop.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.maschion.shirtshop.data.client.Client
import kotlinx.coroutines.flow.Flow

@Dao
interface ClientDao {

    @Query("SELECT * FROM client_table ORDER BY id ASC")
    fun getAllClients(): Flow<List<Client>>

    @Query("SELECT * FROM client_table WHERE id=:clientId")
    fun getSelectedClient(clientId: Int): Flow<Client>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addClient(client: Client)

    @Update
    suspend fun updateClient(client: Client)

    @Delete
    suspend fun deleteClient(client: Client)

    @Query("DELETE FROM client_table")
    suspend fun deleteAllClient()

    @Query("SELECT * FROM client_table WHERE name LIKE :searchQuery")
    fun searchDatabase(searchQuery: String): Flow<List<Client>>



}