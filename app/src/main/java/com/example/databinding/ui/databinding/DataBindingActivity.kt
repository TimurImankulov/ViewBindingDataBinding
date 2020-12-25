package com.example.databinding.ui.databinding

import android.os.Bundle
import com.example.databinding.R
import com.example.databinding.databinding.ActivityDataBindingBinding
import com.example.databinding.ui.BaseDataBindingActivity
import org.koin.androidx.viewmodel.ext.android.viewModel


class DataBindingActivity : BaseDataBindingActivity<ActivityDataBindingBinding>() {

    override val layoutId = R.layout.activity_data_binding
    private val vm by viewModel<DataBindingViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.vm = vm
    }
}