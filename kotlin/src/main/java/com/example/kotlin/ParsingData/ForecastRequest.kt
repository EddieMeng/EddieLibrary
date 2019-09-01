package com.example.kotlin.ParsingData

import com.google.gson.Gson
import java.net.URL

class ForecastRequest(val zipCode: String) {

    companion object {
        private val APP_ID ="15646a0";
        private val URL = "";
        private val COMPLETE_URL = "$URL&APPID=$APP_ID";
    }

    fun execute(): ForecastResult {
        val forecastJsonStr = URL("").readText()
        return Gson().fromJson(forecastJsonStr, ForecastResult::class.java)
    }




}