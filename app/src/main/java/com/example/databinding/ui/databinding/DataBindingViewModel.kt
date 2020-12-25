package com.example.databinding.ui.databinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DataBindingViewModel:ViewModel() {

    val text = MutableLiveData<String>()
    fun changeTextView(){
        text.postValue("sdvsdvsdv")
    }
}