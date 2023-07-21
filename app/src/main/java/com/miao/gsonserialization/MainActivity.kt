package com.miao.gsonserialization

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Sample data
        val person = Person("John Doe", 30, "john.doe@example.com")

        // Serialize the object to JSON
        val json = Utils.serializeToJson(person)
        println("Serialized JSON: $json")

        // Deserialize the JSON back to object
        val deserializedPerson = Utils.deserializeFromJson<Person>(json)
        println("Deserialized Person: $deserializedPerson")
    }
}