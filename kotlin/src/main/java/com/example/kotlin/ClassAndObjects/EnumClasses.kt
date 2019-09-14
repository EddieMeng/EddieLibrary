package com.example.kotlin.ClassAndObjects

import java.util.function.BinaryOperator
import java.util.function.IntBinaryOperator

enum class Direction {
    NORTH,
    SOUTH,
    WEST,
    EAST
}

// <---------------------Initialization---------------------->
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

// <---------------------Anonymous Classes-------------------->
enum class ProtocolState {
    WARNING {
        override fun signal() = TALKING
    },

    TALKING {
        override fun signal(): ProtocolState {
            return WARNING
        }
    };

    abstract fun signal(): ProtocolState
}


// <--------------------- Implementing Interfaces in Enum Classes ----------------------->





// <---------------------- Working with Enum Constant -------------------------->
enum class EnumClass {
    ONE,
    TWO,
    THREE,
    FOUR
}

enum class RGB {
    RED,
    GREEN,
    BLUE
}

inline fun <reified T : Enum<T>> printAllValues() {
    println(enumValues<T>().joinToString {
       it.name
    })
}



