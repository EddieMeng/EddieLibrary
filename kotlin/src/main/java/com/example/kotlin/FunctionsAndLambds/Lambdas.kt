package com.example.kotlin.FunctionsAndLambds


//<---------- Higher-Order Functions ------------->
// A higher-order function is a function that takes functions as parameters, or turns a function
    fun <T, R> Collection<T>.fold(
            initial: R,
            combine: (acc: R, nextElement: T) ->R
    ): R {
        var accumulator: R = initial
        for (element: T in this) {
            accumulator = combine(accumulator, element)
        }
        return accumulator
    }


// <------------ Functions types ------------------>




// <------------ Instantiating a function type ------------------>



// <------------- Invoking a function type instance --------------->





