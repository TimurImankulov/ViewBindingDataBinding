package com.example.databinding

import com.example.databinding.ui.databinding.DataBindingViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel{DataBindingViewModel()}
}

val appModules = listOf(viewModelModule)