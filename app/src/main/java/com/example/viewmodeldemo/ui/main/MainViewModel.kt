package com.example.viewmodeldemo.ui.main


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MainViewModel : ViewModel() {


    private var rate = 0.74f
    var dollarValue: MutableLiveData<String> = MutableLiveData() // добавляем данные в
    // асинхронную лайв дату если используешт датабиндинг то нужно убирать приватность переменных
    var result: MutableLiveData<Float> = MutableLiveData() // добавляем лайв дату  для
    // сохранения изменений

    fun convertValue() { // функция для конвертирования валюты все асинхронно
        dollarValue.let {
            if(!it.value.equals("")) {
                result.value = it.value?.toFloat()?.times(rate)
            } else {
                result.value = 0f
            }
        }
    }






}