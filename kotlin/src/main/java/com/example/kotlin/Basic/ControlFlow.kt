package com.example.kotlin.Basic

class IfExample constructor() {

    init {
        val a = 3;
        val b = 4;

        //normal case
        var max = a
        if (a < b) max = b

        // branch case
        var max2: Int
        if (a > b) {
            max2 = a
        } else {
            max2 = b
        }

        // As expression
        val max3 = if (a > b) a else b

        val max4 = if (a > b) {
            println("choose A")
            a
        } else {
            println("choose B")
            b
        }
    }
}


class WhenExample {
    init {
        var result = when (9) {
            in 1..4 -> println("in range 1 - 4")
            in 5..7 -> println("in range 5 - 7")
            in 8..10 -> println("in range 8 - 10")
            else -> {
                println("not in valid range")
            }
        }
    }
}

class ForLoopExample {
    init {
        var array = arrayOf(1, 2, 3)
        for (item in array) {

        }

//        for (i in 6 downTo 0 step 2) {
//            println(i)
//        }

        for (i in array.indices) {
            println(array[i])
        }

        for ((index, value) in array.withIndex()) {
            println("the element at $index is $value")
        }

    }


class whileExample {
    init {
        var x = 4
        while (x > 0) {

        }

//        do {
//            --x
//        } while (x == 0) {
//            x++
//        }

    }


}



}













