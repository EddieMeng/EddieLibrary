package com.example.kotlin.FunctionsAndLambds

// <-------------- Function declaration ----------------->
fun double(x: Int): Int {
    return 2 * x
}

// <-------------- Function Usage --------------------->
fun read(b: Array<Byte>, off: Int = 0, len: Int = b.size) {

}

// <-------------- Default Arguments --------------------->
open class Functions_A {
    open fun foo(i: Int = 10) {

    }
}

class Functions_B : Functions_A() {
    override fun foo(i: Int) {
        super.foo(i)
    }
}

fun foo(bar: Int = 0, baz: Int) {
    println("default parameter function")
}


// <------------------ Named arguments ------------------------->
fun reformat(str: String,
             normalizeCase: Boolean = true,
             upperCaseFirstLetter: Boolean = true,
             divideByCamelHumps: Boolean = true,
             wordSeparator: Char = ' ') {
}

// <------------------ Unit-returning functions -------------------->
fun printHello(name: String?): Unit {
    if (name != null) {
        println("Hello ${name}")
    } else {
        println("Hi there!")
    }
}

// <------------------ Single-expression functions ---------------------->
fun Functions_double(x: Int): Int = x * 2

// explicitly declaring the return type is optional
// when this can be inferred by the compiler:
fun Functions_double2(x: Int) = x * 2

// <------------------ Explicit return types --------------------->


// <------------------ Variable number of arguments -------------------->
fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) {
        result.add(t)
    }
    return result
}

// <------------------ Infix notation ---------------------->





