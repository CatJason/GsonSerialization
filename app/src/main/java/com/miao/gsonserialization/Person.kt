package com.miao.gsonserialization

import com.google.gson.annotations.SerializedName

data class Person(
    @SerializedName("fullName") val name: String,
    @SerializedName("yearsOld") val age: Int,
    val email: String
)