package com.example.inventory.data.di

import com.example.inventory.data.ItemsRepository
import com.example.inventory.data.OfflineItemsRepository
import org.koin.dsl.module

val repositoryModule = module {
    factory<ItemsRepository> {  OfflineItemsRepository(get()) }
}