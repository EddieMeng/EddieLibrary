package com.example.kotlin.GettingStarted

import com.example.kotlin.ClassAndObjects.Bar1
import com.example.kotlin.ClassAndObjects.Foo

data class Customer(val name: String, val email: String)


class DefaultValuesForFunctionParameters {

    fun foo(a: Int = 0, b: String = "") {

    }
}

class FilteringAList() {

    fun filterList() {
        var list = listOf<Int>()
        var positives = list.filter { x ->
            x > 0
        }
    }

    fun filterList2() {
        var list = listOf<Int>()
        var positives = list.filter {
            it > 0
        }
    }
}

class CheckingElementPresenceInACollection {

    fun checkingElement(): Boolean {
        var emailLists = listOf<String>()
        if ("john@example.com" in emailLists) {
            return true
        }

        if ("john@example.com" !in emailLists) {
            return false
        }
        return false
    }
}

class InstanceCheck() {

}











