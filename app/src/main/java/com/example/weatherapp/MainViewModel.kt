package com.example.weatherapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val lifeDataCurrent = MutableLiveData<String>()
    val lifeDataList = MutableLiveData<List<String>>()

}