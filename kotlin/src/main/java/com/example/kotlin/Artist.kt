package com.example.kotlin

class Artist {
    var name: String = "boogeyman";

    data class Artist(var id: Long, var name: String, var uri: String, var mbid: String)

}