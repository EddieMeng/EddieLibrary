package com.example.kotlin.ClassAndObjects

class Packages {
    // visible inside VisibilityModifiers.kt
    private fun foo() {

    }

    // property is visible everywhere
    // setter is visible only in VisibilityModifiers.kt
    var bar: Int = 5
        private set

    // visible inside the same module
    internal val baz = 6
}

// ------->  ClassAndInterface  <----------
open class Outer {
    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4

    protected class Nested {
        val e: Int = 5
    }

    //todo kotlin progress here
}








