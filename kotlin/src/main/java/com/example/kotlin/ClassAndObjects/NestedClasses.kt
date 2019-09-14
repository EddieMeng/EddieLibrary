package com.example.kotlin.ClassAndObjects

class NestedClasses_Outer {
    private val bar: Int = 1
    class nested {
        fun foo() = 2
    }

    inner class Inner {
        fun foo() = bar
    }

}








