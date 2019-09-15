package com.example.kotlin.ClassAndObjects

interface MyInterface {
    fun bar()
    fun foo() {

    }
}


/**
 * Implement interface
 */

class Child : MyInterface {

    override fun bar() {

    }
}


/**
 * Properties in Interface
 */

interface MyInterface2 {
    val prop: Int
    val propertyWithImplementation: String
        get() = "foo"

    fun foo() {
        println(prop)
    }
}

class Child2 : MyInterface2 {
    override val prop: Int = 29
}


/**
 * Interface Inheritance
 */

interface Named {
    val name: String
}

interface PersonAnother : Named {
    val firstname: String
    val lastname: String

    override val name: String
        get() = "$firstname $lastname"
}

data class Employee(override val firstname: String, override val lastname: String) : PersonAnother {

}


/**
 * Resolving overriding conflicts
 */
interface A1 {
    fun foo() {
        println("A1")
    }

    fun bar()
}

interface B1 {
    fun foo() {
        println("B1")
    }

    fun bar() {
        println("bar")
    }
}

class C1 : A1 {

    override fun bar() {
        println("bar")
    }
}

class D : A1, B1 {
    override fun foo() {
        super<A1>.foo()
        super<B1>.foo()
    }

    override fun bar() {
        super<B1>.bar()
    }
}





































