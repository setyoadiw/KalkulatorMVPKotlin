package com.luminary.setyo.kalkulatormvpkotlin

import android.widget.EditText

/**
 * Created by root on 17/02/18.
 */
class KalkulatorPresenterImp:KalkualtorPresenter {


    var mainlView : MainView? = null

    constructor(mainlView: MainView?) {
        this.mainlView = mainlView
    }


    override fun proses(nilai1: EditText, nilai2: EditText, tipe: String) {
        var a = nilai1.text.toString()
        var b = nilai2.text.toString()

        if (a.isNotEmpty() || b.isNotEmpty() ){

            if (tipe == "*"){
                var hasil = a.toDouble()*b.toDouble()
                mainlView?.hasil(hasil.toString())
            }else if (tipe == "+"){
                var hasil = a.toDouble()+b.toDouble()
                mainlView?.hasil(hasil.toString())
            }else if (tipe == "/"){
                var hasil = a.toDouble()/b.toDouble()
                mainlView?.hasil(hasil.toString())
            }else if (tipe == "-"){
                var hasil = a.toDouble()-b.toDouble()
                mainlView?.hasil(hasil.toString())
            }

        }

        else{
            mainlView?.kosong()
        }
    }


}