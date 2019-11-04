package com.example.kotlin.ClassAndObjects


/**
 * <---Declaring Properties--->
 */
class Address {
    var name: String = "Holmes, Sherlock"
    var street: String = "Baker"
    var city: String = "London"
    var state: String? = null
    var zip: String = "123456"
}

fun copyAddress(address: Address): Address {
    val result = Address()
    result.name = address.name
    result.street = address.street
    return result
}

/**
 * <!--- Getters ans Setters !--->
 */

class GetterAndSetter {
    // Since Kotlin 1.1, you can omit the (property type) if it can be inferred from the getter:
    var initialized = 1

    // defined custom getter
    val isEmpty: Boolean
        get() = this.equals("")

    // defined custom setter
    var stringRepresentation
        get() = this.toString()
        set(value) {
            value.toUpperCase()
        }

    // just change the visibility of the field, but do not change the default implementation
    var setterVisibility: String = "abc"
        private set

    var setterWithAnnotation: Any? = null
//    @Inject set
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

class User {
    var firstname: String? = null
    // do not call setter inside setter
//        set(value) {
//            firstname = value
//        }
    set(value) {
        field = value
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

// const must be declared in top level
const val SUBSYSTEM_DEPRECATED: String = "the subsystem is deprecated"
class CompileTimeConstants {

}

/**
 * <!-- Late-Initialized Properties and Variables--! >
 *
 */
class LateInitializedPropertiesAndVariables {
    open lateinit var subject: Any

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







