package com.example.sampleapp.data

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create


//object means that this is a singleton class i.e there can only be one object created of this class.
object RetrofitBuilder {
    //define the base URL
    private const val BASE_URL = "http://jsonplaceholder.typicode.com/"
    //create moshi  object with JsonAdapterFactory in Kotlin
    private val moshi: Moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL).addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
    }
    //finally just get Retrofit instance and create it for ApiService class
    val apiService = getRetrofit().create(ApiService::class.java)
}