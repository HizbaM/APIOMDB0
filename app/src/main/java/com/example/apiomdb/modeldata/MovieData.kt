package com.example.apiomdb.modeldata

import com.google.gson.annotations.SerializedName

data class MovieData(
    val Year:String, val Title:String,
    @SerializedName("Poster") val gambar:String
)
