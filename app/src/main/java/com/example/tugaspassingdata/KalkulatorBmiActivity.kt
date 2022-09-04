package com.example.tugaspassingdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kalkulator_bmi.*

class KalkulatorBmiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator_bmi)

        btnReset.setOnClickListener {
            reset()
        }
        btnIntent.setOnClickListener {
            intentData()
        }
        btnBundle.setOnClickListener {
            bundleData()
        }
        btnParcelable.setOnClickListener {
            parcelableData()
        }
        btnSerializable.setOnClickListener {
            serialezableData()
        }


    }
    fun kategori(bmi: Double):String{
        val kategori: String
        if (bmi < 16 && bmi > 0) {
            kategori = "Terlalu Kurus"
        } else if (bmi >= 16 && bmi <= 17) {
            kategori = "Cukup Kurus"
        } else if (bmi > 17 && bmi <= 18.5) {
            kategori = "Sedikit Kurus"
        } else if (bmi > 18.5 && bmi <= 25) {
            kategori = "Normal"
        } else if (bmi > 25 && bmi <= 30) {
            kategori = "Gemuk"
        } else if (bmi > 30 && bmi <= 35) {
            kategori = "Obesitas Kelas I"
        } else if (bmi > 35 && bmi <= 40) {
            kategori = "Obesitas Kelas II"
        } else if (bmi > 40) {
            kategori = "Obesitas Kelas III"
        }
        else kategori = "BMI Keluar Ambang Batas"
        return kategori
    }
    fun hitungBMI(berat: Double, tinggi: Double): Double{
        var tb = tinggi / 100
        var bmi = berat / (tb*tb)
        return bmi
    }

    fun reset(){
        editTextUmur.setText("")
        editTextBeratBadan.setText("")
        editTextTinggiBadan.setText("")
    }


    fun intentData(){
        var umur = editTextUmur.text.toString()
        var tinggi = editTextTinggiBadan.text.toString()
        var berat = editTextBeratBadan.text.toString()
        var bmi = hitungBMI(berat.toDouble() , tinggi.toDouble())
        var kategori = kategori(bmi)

        var pindah = Intent (this, IntentHasilActivity::class.java)
        pindah.putExtra("dataUmur", umur)
        pindah.putExtra("dataTinggi", tinggi)
        pindah.putExtra("dataBerat", berat)
        pindah.putExtra("bmi", String.format("%.2f", bmi))
        pindah.putExtra("kategori", kategori)
        startActivity(pindah)
    }

    fun bundleData(){
        var umur = editTextUmur.text.toString()
        var tinggi = editTextTinggiBadan.text.toString()
        var berat = editTextBeratBadan.text.toString()
        var bmi = hitungBMI(berat.toDouble() , tinggi.toDouble())
        var kategori = kategori(bmi)

        var bundle = Bundle()
        var pindah = Intent (this, BundleHasilActivity::class.java)
        bundle.putString("dataUmur", umur)
        bundle.putString("dataTinggi", tinggi)
        bundle.putString("dataBerat", berat)
        bundle.putString("bmi", String.format("%.2f", bmi))
        bundle.putString("kategori", kategori)
        pindah.putExtras(bundle)
        startActivity(pindah)

    }
    fun parcelableData(){
        var umur = editTextUmur.text.toString()
        var tinggi = editTextTinggiBadan.text.toString()
        var berat = editTextBeratBadan.text.toString()
        var bmi = hitungBMI(berat.toDouble() , tinggi.toDouble())
        var kategori = kategori(bmi)

        val intent = Intent(this,ParcelableHasilActivity::class.java)
        var data = DataClassParcelable(umur,tinggi,berat,String.format("%.2f", bmi),kategori)
        intent.putExtra("dataParcelable", data)
        startActivity(intent)
    }

    fun serialezableData(){
        var umur = editTextUmur.text.toString()
        var tinggi = editTextTinggiBadan.text.toString()
        var berat = editTextBeratBadan.text.toString()
        var bmi = hitungBMI(berat.toDouble() , tinggi.toDouble())
        var kategori = kategori(bmi)

        val intent = Intent(this,SerialezableHasilActivity::class.java)
        var data = DataClassSerialezable(umur,tinggi,berat,String.format("%.2f", bmi),kategori)
        intent.putExtra("databmi", data)
        startActivity(intent)
    }
}