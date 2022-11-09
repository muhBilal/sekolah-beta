package com.example.list

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Movie(val title:String, val desc: String, val imgCovert: String): Parcelable
