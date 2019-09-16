package com.example.kotlin.GettingStarted

class DefiningFuctions constructor() {
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun sum2(a: Int, b: Int) = a + b

    fun printSum(a: Int, b: Int): Unit {
        println("sum of $a and $b is ${a + b}")
    }

    fun printSum2(a: Int, b: Int) {
        println("sum of $a and $b is ${a + b}")
    }

}


class DefiningVariables {
    var x = 0

    fun changeValue(): Unit {
        val a: Int = 1
        val b = 2

        var x = 5
        x += 1
    }

    fun incrementX() {
        x += 1
    }

}

// <------------- String templates -------------->
class UsingStringTemplates {
    var a = 1
    val s1 = "a is $a"

    fun usingString() {
        a = 2
        val s2 = "${s1.replace("is", "was")}, but now is $a"
    }

}


// <------------- Conditional expressions -------------->
class UsingConditionalExpression {

    fun maxOf(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    fun maxOf2(a: Int, b: Int) = if (a > b) a else b

}

// <------------- Nullable values and null checks -------------->
class UsingNullableValuesAndCheckingForNull {

    fun parseInt(str: String): Int? {
        return null
    }

    fun printProduct(arg1: String, arg2: String) {
        val x = parseInt(arg1)
        val y = parseInt(arg2)

        if (x != null && y != null) {
            println(x * y)
        } else {
            println("either $arg1 or $arg2 is not a number")
        }
    }
}

// <------------- Type checks and automatic casts -------------->

class UsingTypeChecksAndAutomaticCasts {
    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            return obj.length
        }
        return null
    }
}

fun getStringLength(obj: Any): Int? {
//    if (obj !is String) {
//        return null
//    }
//    return obj.length
    if (obj is String && obj.length > 0) {
        return obj.length
    }
    return null
}


// <------------- for loop -------------->
class UsingForLoop {

    fun forLoop() {
        val items = listOf("apple", "banana", "kiwifruit")
        // use "in" keyworld
        for (item in items) {
            println(item)
        }
    }

    fun forLoop2() {
        val items = listOf("apple", "banana", "kiwifruit")

        for (index in items.indices) {
            println("item at $index is ${items[index]}")
        }
    }
}

// <------------- while loop -------------->
class UsingWhileLoop {
    fun whileLoop() {
        val items = listOf("apple", "banana", "kiwifruit")
        var index = 0
        while (index < items.size) {
            println("item at $index is ${items[index]}")
            index++
        }
    }
}

// <------------- when loop -------------->
class UsingWhenExpression {
    fun describe(obj: Any): String =
            when (obj) {
                1 -> "One"
                "Hello" -> "Greeting"
                is Long -> "Long"
                !is String -> "Not a String"
                else -> "Unknown"
            }
}

// <------------- Ranges -------------->
class Ranges {
    init {
        val x = 10
        val y = 9

        if (x in 1..y + 1) {
            println("fits in range")
        }
    }

    fun notInRange() {
        var list = listOf("a", "b", "c")
        if (-1 !in 0..list.lastIndex) {
            println("-1 is out of range")
        }

        if (list.size !in list.indices) {
            println("list size is out of valid list indices range, too")
        }
    }


    fun overProgressionByStep() {
        for (x in 1..10 step 2) {
            println(x)
        }
    }

    fun overProgressionDownTo() {
        for (x in 9 downTo 0 step 3) {
            println(x)
        }
    }
}




























