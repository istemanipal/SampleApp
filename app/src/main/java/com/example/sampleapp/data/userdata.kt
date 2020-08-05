package com.example.sampleapp.data

import com.squareup.moshi.Json

data class User(
    val id:Int,
    val name:String,
    val email:String,
    val address:UserAddress,
    val phone:String,
    @Json(name="website")
    val url:String,
    val company:Company
)

data class UserAddress (
    val street:String,
    val suite:String,
    val city:String,
    @Json(name="zipcode")
    val zipCode:String,
    @Json(name="geo")
    val location:Geo
)

data class Geo(
    @Json(name="lat")
    val latitude:String,
    @Json(name="lng")
    val longitude:String
)

data class Company(
    val name:String,
    val catchPhrase:String,
    val bs:String
)

