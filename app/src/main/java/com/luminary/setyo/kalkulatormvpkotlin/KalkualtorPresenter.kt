package com.luminary.setyo.kalkulatormvpkotlin

import android.widget.EditText

/**
 * Created by root on 17/02/18.
 */
interface KalkualtorPresenter {


//    fun kali(nilai1 : EditText,nilai2 : EditText)
//    fun bagi(nilai1 : EditText,nilai2 : EditText)
//    fun tambah(nilai1 : EditText,nilai2 : EditText)
//    fun kurang(nilai1 : EditText,nilai2 : EditText)

    fun proses(nilai1: EditText, nilai2: EditText, tipe: String)
}