package com.example.kotlin.ClassAndObjects

/**
 * if the wrapped type is primitive, the performance hit is terrible,
 * because primitive types are usually heavily optimized by the runtime,
 * while their wrappers don't get any special treatment.
 */

inline class Password(val value: String) {

}

// <--------------- Members ------------------>
inline class Name(val s: String) {
    val length: Int
    get() = s.length

    fun greet() {
        println("Hello, $s")
    }
}

// <---------------- Inherience ------------------->
interface Printable {
    fun prettyPrint(): String
}

inline class Name2(val s: String): Printable{

    override fun prettyPrint(): String {
        return "Let's $s!"
    }
}

/** Note: It is forbidden for inline classes to participate in a class hierarchy.
This means that inline classes cannot extend other classes and must be final.
 */


// <------------------- Representation ------------------------>






// <------------------ Mangling --------------------->











