package com.example.apiomdb

import com.example.apiomdb.modeldata.SearchData
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("?i=tt3896198&apikey=64fafac6")
    fun getMovies():Call<SearchData>
}