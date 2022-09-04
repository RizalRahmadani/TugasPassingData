package com.example.tugaspassingdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent_hasil.*

class SerialezableHasilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_serialezable_hasil)
        ambilDataSerialezable()

    }


    fun ambilDataSerialezable(){
        val dataSerial = intent.getSerializableExtra("databmi") as DataClassSerialezable
        txtUmur.text= dataSerial.umur
        txtTinggiBadan.text= dataSerial.tinggi
        txtBeratBadan.text=dataSerial.berat
        txtBMI.text = dataSerial.bmi
        txtKategori.text = dataSerial.kategori
    }
}