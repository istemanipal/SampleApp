package com.example.sampleapp.data

class ApiHelper (private val apiService: ApiService){
    //This is Kotlin's 1 line syntax when only return statement is there in the function body, we can use = symbol directly
    suspend fun getUsers()=apiService.getUsers()
}