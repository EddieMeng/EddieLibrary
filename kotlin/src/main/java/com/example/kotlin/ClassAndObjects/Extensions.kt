package com.example.kotlin.ClassAndObjects


/**
 * Kotlin provides the ability to extend a class with new functionality without
 * having to inherit from the class or use design patterns such as Decorator.
 */


// <------------ ExtensionFunctions -------------------->





// <---------------- Extensions are resolved statically ------------------->

open class Shape()


class Rectangle: Shape() {

}

fun Shape.getName() = "Shape"
fun Rectangle.getName() = "Rectangle"

fun printClassName(s: Shape) {
    println(s.getName())
}

class Example {
    fun printFunctionType() {
        println("Class Method")
    }
}

fun Example.printFucntionType() {
    println("Extension Function")
}

fun Example.printFunctionType(i: Int) {

}

// <--------------------- Nullable receiver --------------------->
fun Any?.toString(): String {
    if (this == null) {
        return "null"
    }
    return toString()
}


// <----------------------- Extension properties ----------------------->

// initializers are not allowed for extension properties
val <T> List<T>.lastIndex: Int
get() = size - 1

// <------------------------ Companion Object Extensions ----------------------->
class MyClass {
    companion object {

    }
}

fun MyClass.Companion.printCompanion() {
    println("Companion")
}

// <---------------------------- Scope of Extensions ---------------------------->
fun List<String>.getLongestString() {

}


// <---------------------------- Declaring extensions as members -------------------------->


