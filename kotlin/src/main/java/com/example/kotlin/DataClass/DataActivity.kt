package com.example.kotlin.DataClass

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kotlin.R
import java.util.*
import kotlin.collections.HashMap

class DataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        var fl = Forecast(Date(), 27.5f, "Shiny day")
        var f2 = fl.copy(temperature = 30f)


        // Mapping an object into variables
        var(myDate, myTemperatur, myDetails) = f2

        var myHashMap = HashMap<Int, Int>()
        myHashMap.put(1, 1)
        myHashMap.put(2, 2)

        for ((key, value) in myHashMap) {

        }





    }
}
