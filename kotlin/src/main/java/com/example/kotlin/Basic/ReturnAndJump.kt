package com.example.kotlin.Basic

import android.os.Looper.loop

class BreakAndContinueLabel {
    init {
        loop@ for (i in 1..10) {
            println("i is $i")
            for (j in 1..10) {
                println("j is $j")
                if (j == 2) {
                    break@loop
                }
            }
        }
        println("loop finish")
    }
}

class ReturnAtLabels {

    init {
        foo()
    }

    private fun foo() {
        // lambda expressions pass to inline function
//        listOf(1, 2, 3, 4, 5).forEach {
//            if (it == 3) {
//                return
//            }
//            println("Lambda $it")
//        }


        // use implicit lambda labels
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) {
                return@forEach
            }
            println(it)
        }
        println("done with implicit label")

        // replace lambda expression with anonymous fuction
        listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
            if (value == 3) {
                return
            }
            println(value)
        })
        println("This reachable")


        run loop@{
            listOf(1, 2, 3, 4).forEach {
                if (it == 3) {
                    return@loop
                }
                println(it)
            }
        }
        println("done with nested loop")




    }

}







