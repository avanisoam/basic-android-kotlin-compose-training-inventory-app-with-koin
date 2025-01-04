package com.example.inventory.data.di

import android.app.Application
import androidx.room.Room
import com.example.inventory.data.InventoryDatabase
import com.example.inventory.data.ItemDao
import org.koin.dsl.module

fun provideDataBase(application: Application): InventoryDatabase =
    Room.databaseBuilder(
        application,
        InventoryDatabase::class.java,
        "item_database"
    )
        .fallbackToDestructiveMigration()
        .build()

fun provideDao(inventoryDataBase: InventoryDatabase): ItemDao =
    inventoryDataBase.itemDao()

val dataBaseModule = module {
    single { provideDataBase(get()) }
    single { provideDao(get()) }
}