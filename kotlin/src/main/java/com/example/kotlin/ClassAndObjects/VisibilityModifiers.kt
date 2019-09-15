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
    // only visible inside this class
    private val a = 1
    // same as private + visible in subclass too
    protected open val b = 2
    // any client inside this module who sees declaring class sees it's internal members
    internal val c = 3
    // any client who sees the declaring class sees it's public members
    val d = 4

    protected class Nested {
        val e: Int = 5
    }
}

class Subclass : Outer() {
    override val b: Int = 7
}

class Unrelated(o: Outer) {

}

// -----------------> Constructors <-------------------------
class Cons constructor(a: Int) {



}


// -----------------> Modules <-----------------------------



