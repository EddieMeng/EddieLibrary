package com.example.kotlin.ClassAndObjects

import javax.security.auth.Subject


/**
 * <!--- Getters ans Setters !--->
 *
 */

class GetterAndSetter {

    // Since Kotlin 1.1, you can omit the property type if it can be inferred from the getter:
    val isEmpty
        get() = this.equals("")

    var stringRepresentation
    get() = this.toString()
    set(value) {
        value.toUpperCase()
    }

    var setterVisibility: String = "abc"
    private set

    var setterWithAnnotation: Any? = null

    init {
        // immutable variable
        var allByDefault: Int?
        var initialized = 1

        // mutable variable
        val simple: Int?
        val inferredType = 1
    }

}


/**
 * <!-- Backing Fileds--! >
 */
class BackingFileds {
    var counters = 0
    set(value) {
        if (value >= 0) field = value
    }
}

/**
 * <!-- Backing Properties--! >
 */
class BackingProperties {


}


/**
 * <!-- Compile-Time Constants--! >
 */
const val SUBSYSTEM_DEPRECATED: String = "the subsystem is deprecated"
class CompileTimeConstants {

}


/**
 * <!-- Late-Initialized Properties and Variables--! >
 *
 */
class LateInitializedPropertiesAndVariables{
    lateinit var subject: Any

    fun setUp() {
        subject = Any()

    }

    fun checkIsInitialized(): Boolean {
        if (this::subject.isInitialized) {
            return true
        }
        return false
    }

}






