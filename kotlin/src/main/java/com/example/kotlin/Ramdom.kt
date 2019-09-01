package com.example.kotlin

import android.service.autofill.Validators.not
import android.util.Log
import com.example.kotlin.Properties.Person

class Ramdom constructor(parent: Person) {

    init {

    }

    constructor(name: String, parent: Person): this(parent){

    }


    fun ramdom() {
        // explicitly specified as nullable
//        var fooNullable: String? = null
//        println(fooNullable?.length)
//        println(fooNullable?.length ?: -1)
//        helloKitty("Kitty")
        var notOdd = not(::odd)
        var notEven = not(::even)
        val notZero = not{n -> n == 0}
        var notPositive = not{it -> it > 0}

        println("${notOdd(5)}")
        println("${notEven(7)}")
        println("${notZero(3)}")
        println("${notPositive(4)}")
    }


    fun helloKitty(name: String = "world"): String {
        var content = "Hello, $name"
        Log.i("Ramdom", content)
        return content
    }

    fun varargExample(vararg name: Int) {
        println("Argument has ${name.size} elements")
    }

    fun odd(x: Int): Boolean = x % 2 == 1

    fun even(x: Int) = x % 2 == 0

    // take functions as argument and return function
    fun not(f: (Int) -> Boolean): (Int) -> Boolean {
        return {n -> !f.invoke(n)}
    }




}