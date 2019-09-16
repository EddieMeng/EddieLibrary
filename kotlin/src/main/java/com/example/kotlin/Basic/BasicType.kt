package com.example.kotlin.Basic

import java.lang.IllegalArgumentException

class BasicTypes constructor() {

    init {
//        explicitConversions()
//        operationExample()
//        floatPointNumbersComparisonExample()
//        characterExample('9')
//        arrayExample()
//        StringExample("HelloKitty")
//        StringLiteralsExample()
        StringTemplateExample()
    }

    private fun explicitConversions() {
        val byte: Byte = 1
        val i: Int = byte.toInt()
        println(i)
    }


    private fun operationExample() {
        val x = (1 shl 2) and 0x000FF000
        println(x)
    }

    private fun floatPointNumbersComparisonExample() {


    }

    private fun characterExample(c: Char): Int {
        if (c in '0'..'5') throw IllegalArgumentException("Out of range")
        val result = c.toInt() - '1'.toInt()
        println(result)
        return result
    }

    private fun arrayExample() {
        val array = arrayOf("1", "2", "3")
        val array2 = arrayOfNulls<Int>(3)

        val array3 = Array(5) { i ->
            (i * i).toString()
        }

        array3.forEach {
            println(it)
        }

        val xArray: IntArray = intArrayOf(1, 2, 3)
        val yArray: LongArray = longArrayOf(4, 5, 6)
    }

    private fun UnsignedIntegers() {

    }


    private fun StringExample(string: String) {
        for (c in string) {
            print(c)
        }

        val s = "abc" + 1
        println(s + "def")
    }

    private fun StringLiteralsExample() {
        // escaped strings that have escaped characters
        val s = "Hello, world!\n"
        println(s)

        // raw String
        val text = """
            for (c in "foo")
            println(c)
        """
        println(text)

        val text2 = """
            |Tell me and I forget
            |Teach me and I remember
            |Involve me and I learn
            |(Benjamin Franklin)
        """.trimMargin()

        println(text2)
    }

    private fun StringTemplateExample() {
        var i = 10;
        println("i = $i")

        val s = "abc"
        println("$s. length is ${s.length}")

        val price ="""
            |${'$'}9.99
        """.trimMargin()

        println(price)
    }



}
