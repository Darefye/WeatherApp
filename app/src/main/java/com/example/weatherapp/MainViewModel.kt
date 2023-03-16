package com.example.weatherapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weatherapp.adapters.WeatherModel

class MainViewModel : ViewModel() {
    val lifeDataCurrent = MutableLiveData<WeatherModel>()
    val lifeDataList = MutableLiveData<List<WeatherModel>>()

}