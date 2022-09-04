package com.example.tugaspassingdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent_hasil.*

class IntentHasilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_hasil)
        ambilDataIntent()

    }

    fun ambilDataIntent(){
        var umur = intent.getStringExtra("dataUmur")
        var tinggi = intent.getStringExtra("dataTinggi")
        var berat = intent.getStringExtra("dataBerat")
        var bmi = intent.getStringExtra("bmi")
        var kategori = intent.getStringExtra("kategori")

        txtUmur.text = "$umur tahun"
        txtTinggiBadan.text= "$tinggi cm"
        txtBeratBadan.text="$berat kg"
        txtBMI.text = bmi
        txtKategori.text = kategori
    }
}