package com.recepgemalmaz.mvvmkullanimi

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivityViewModel: ViewModel(){

    var sonuc = MutableLiveData("0")
    var mrepo = MatematikRepository()

    fun toplama(alinanSayi1 : String, alinanSayi2 : String){
        CoroutineScope(Dispatchers.Main).launch {
            sonuc.value = mrepo.toplama(alinanSayi1, alinanSayi2)
        }

    }
    fun carpma(alinanSayi1: String, alinanSayi2: String){
        CoroutineScope(Dispatchers.Main).launch {
            sonuc.value = mrepo.carpma(alinanSayi1, alinanSayi2)
        }

    }
}