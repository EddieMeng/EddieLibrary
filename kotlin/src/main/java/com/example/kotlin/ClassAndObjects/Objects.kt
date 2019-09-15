package com.example.kotlin.ClassAndObjects

import android.net.sip.SipSession
import java.security.Provider
import java.time.Month

/**
 * Sometimes we need to create an object of a slight modification of some class,
 * without explicitly declaring a new subclass for it.
 */

// <---------- Object expressions -------------->
open class Objects_A(x: Int) {
    open val y: Int = x
}

interface Objects_B {

}

//f you use an anonymous object as a return type of a public function or the type of a public property,
// the actual type of that function or property will be the declared supertype of the anonymous object

class Objects_C {

    private fun foo() = object {
        val x: String = "x"
    }

    fun publicFoo() = object {
        val x: String = "x"
    }

    fun bar() {
        val x1 = foo().x
    }
}

// <------------- Object declarations ---------------->

// an object declaration is not an expression, and cannot be used on the right hand side of an assignment statement.
// Object declaration's initialization is thread-safe.
object DataProviderManager {
    fun registerDataProvider() {

    }
}


// Such objects can have supertypes:
object DefaultListener : SipSession.Listener() {

}
// Notes: 1.object declarations can't be local



// <----------------- Companion Objects ----------------->
//todo kotlin progress here
class Objects_MyClass {
    companion object: Factory<Objects_MyClass>{
        override fun create(): Objects_MyClass {
            return Objects_MyClass()
        }
    }
}

interface Factory<T> {
    fun create(): T
}







