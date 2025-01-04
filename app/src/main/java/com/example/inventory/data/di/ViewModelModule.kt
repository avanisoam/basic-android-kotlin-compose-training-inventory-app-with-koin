package com.example.inventory.data.di

import com.example.inventory.ui.home.HomeViewModel
import com.example.inventory.ui.item.ItemDetailsViewModel
import com.example.inventory.ui.item.ItemEditViewModel
import com.example.inventory.ui.item.ItemEntryViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel{
        ItemEditViewModel(get(),get())
    }

    viewModel{
        ItemEntryViewModel(get())
    }

    viewModel{
        ItemDetailsViewModel(get(),get())
    }

    viewModel{
        HomeViewModel(get())
    }
}