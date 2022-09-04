package com.example.tugaspassingdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent_hasil.*

class ParcelableHasilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parcelable_hasil)
        ambilDataParcelable()

    }

    fun ambilDataParcelable(){
        val data = intent.getParcelableExtra("dataParcelable") as DataClassParcelable?
        txtUmur.text = data?.umur
        txtTinggiBadan.text= data?.tinggi
        txtBeratBadan.text=data?.berat
        txtBMI.text = data?.bmi
        txtKategori.text = data?.kategori
    }
}