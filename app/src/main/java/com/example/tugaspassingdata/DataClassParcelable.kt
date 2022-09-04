package com.example.tugaspassingdata

import android.os.Parcel
import android.os.Parcelable

data class DataClassParcelable (val umur : String, val tinggi: String, val berat: String, val bmi : String, val kategori: String):Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(umur)
        parcel.writeString(tinggi)
        parcel.writeString(berat)
        parcel.writeString(bmi)
        parcel.writeString(kategori)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DataClassParcelable> {
        override fun createFromParcel(parcel: Parcel): DataClassParcelable {
            return DataClassParcelable(parcel)
        }

        override fun newArray(size: Int): Array<DataClassParcelable?> {
            return arrayOfNulls(size)
        }
    }
}