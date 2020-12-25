package com.example.databinding.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.databinding.databinding.ActivityDataBindingBinding

abstract class BaseDataBindingActivity<B: ViewDataBinding> : AppCompatActivity() {

    protected abstract val layoutId: Int
    protected lateinit var binding: B

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutId)
        binding.lifecycleOwner = this
        setContentView(binding.root)
    }
}