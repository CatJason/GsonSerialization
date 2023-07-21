package com.miao.gsonserialization

import com.google.gson.Gson

object Utils {
    // Serialize an object to JSON string
    fun serializeToJson(obj: Any): String {
        return Gson().toJson(obj)
    }

    // Deserialize a JSON string to object
    inline fun <reified T> deserializeFromJson(json: String): T {
        return Gson().fromJson(json, T::class.java)
    }
}
