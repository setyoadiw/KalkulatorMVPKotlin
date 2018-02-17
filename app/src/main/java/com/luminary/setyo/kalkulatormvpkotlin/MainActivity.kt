package com.luminary.setyo.kalkulatormvpkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {

    lateinit var presenter :KalkulatorPresenterImp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initPresenter()
        initView()
    }

    private fun initView() {

        btKali.setOnClickListener {
            presenter.proses(edt1,edt2,btKali.text.toString())
        }

        btKurang.setOnClickListener {
            presenter.proses(edt1,edt2,btKurang.text.toString())
        }

        btTambah.setOnClickListener {
            presenter.proses(edt1,edt2,btTambah.text.toString())
        }

        btBagi.setOnClickListener {
            presenter.proses(edt1,edt2,btBagi.text.toString())
        }
    }

    override fun kosong() {
     Toast.makeText(this,"Kosong",Toast.LENGTH_LONG).show()
    }

    override fun hasil(toString: String) {
     tvHasil.text=toString
    }

    private fun initPresenter() {
        presenter = KalkulatorPresenterImp(this)
    }
}
