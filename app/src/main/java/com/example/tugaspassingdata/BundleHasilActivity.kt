package com.example.tugaspassingdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bundle_hasil.*
import kotlinx.android.synthetic.main.activity_intent_hasil.*
import kotlinx.android.synthetic.main.activity_intent_hasil.txtBMI
import kotlinx.android.synthetic.main.activity_intent_hasil.txtBeratBadan
import kotlinx.android.synthetic.main.activity_intent_hasil.txtKategori
import kotlinx.android.synthetic.main.activity_intent_hasil.txtTinggiBadan
import kotlinx.android.synthetic.main.activity_intent_hasil.txtUmur

class BundleHasilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bundle_hasil)
        ambilDataBundle()

    }

    fun ambilDataBundle(){
        var bun = intent.extras
        if(bun != null){
            txtUmur.setText(bun!!.getString("dataUmur"))
            txtTinggiBadan.setText(bun!!.getString("dataTinggi"))
            txtBeratBadan.setText(bun!!.getString("dataBerat"))
            txtBMI.setText(bun!!.getString("bmi"))
            txtKategori.setText(bun!!.getString("kategori"))
        }
    }
}