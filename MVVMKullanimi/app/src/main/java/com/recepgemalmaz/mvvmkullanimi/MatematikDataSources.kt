package com.recepgemalmaz.mvvmkullanimi

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MatematikDataSources {
    suspend fun toplama(alinanSayi1 : String, alinanSayi2 : String):String =
        withContext(Dispatchers.IO){

        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()

        val toplam = sayi1 + sayi2
        return@withContext  toplam.toString()

    }
    suspend fun carpma(alinanSayi1: String, alinanSayi2: String):String =
        withContext(Dispatchers.IO){
        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()

        val carpma = sayi1 * sayi2
        return@withContext  carpma.toString()

    }
}