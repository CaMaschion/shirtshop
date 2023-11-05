package com.maschion.shirtshop.di

import android.content.Context
import androidx.room.Room
import com.maschion.shirtshop.data.client.ClientDatabase
import com.maschion.shirtshop.utils.Constants.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        ClientDatabase::class.java,
        DATABASE_NAME
    ).build()

    @Provides
    fun provideDao(
        database: ClientDatabase
    ) = database.clientDao()
}