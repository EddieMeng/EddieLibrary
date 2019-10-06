package com.example.kotlin.ClassAndObjects

import android.content.Context
import android.util.AttributeSet
import android.view.View
import org.jetbrains.annotations.Nullable


// <-----------Constructors------------->
class Person constructor(name: String) {

}

class Person2(name: String) {

}

class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)
    val customerKey = name.toUpperCase()

    init {
        println("First initializer block that prints ${name}")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}


class Person3(name: String) {
    val children: MutableList<Person3> = mutableListOf<Person3>()

    constructor(name: String, parent: Person3) : this(name) {
        parent.children.add(this)
    }
}


/**
 *  If you do not want your class to have a public constructor,
 *  you need to declare an empty primary constructor with non-default visibility:
 */
class DontCreateMe private constructor() {


}


//todo Review Progress Here


open

class Base(p: Int)

class Derived(p: Int) : Base(p)

// Note that in this case different secondary constructors
// can call different constructors of the base type:
class MyView : View {
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
}

// Overriding Methods
// Kotlin requires explicit modifiers for overridable members
open class Base2 {
    open fun v() {

    }

    fun nv() {

    }
}

open class Derived2() : Base2() {
    override fun v() {
        super.v()
    }
}

open class Derived3() : Derived2() {
    override fun v() {
        super.v()
    }
}


// Overriding Properties
open class Foo {
    open val x: Int
        get() {
            return 0
        }
}

class Bar1 : Foo() {
    override val x: Int = 5
}


// 1.Use the override keyworld as part of the property declaration in a primary constructor
// 2. Override val with var property
open class ClassAndInheritance_Shape() {
    open val vertexCount: Int = 0
}

class ClassAndInheritance_Rectangle: ClassAndInheritance_Shape() {
    override val vertexCount: Int = 4
}

// 1.Note that you can use the override keyword as part of the property
// declaration in a primary constructor.
// 2.you can override val with var, but not vice versa.
interface Foo2 {
    val count: Int
}

class Bar2(override var count: Int) : Foo2


class Bar3() : Foo2 {
    override var count: Int = 0
}

/**
 * <!-------Derived class initialization order-----------!>
 */
open class BaseClass(val name: String) {
    init {
        println("Initializing Base")
    }

    open val size: Int = name.length.also { println("Initializing size in Base: $it") }

}

class DerivedClass(name: String, val lastName: String) : BaseClass(name.capitalize().also { println("Argument for Base: $it") }) {
    init {
        println("Initializing Derived")
    }

    override val size: Int = (super.size + lastName.length).also { println("Initializing size in Derived: $it") }
}


/**
 *
 * <!----Calling the superclass implementation>
 *
 */

open class Parent {
    open fun f() {
        println("Parent.f()")
    }

    open val x: Int get() = 1
}

class Son : Parent() {

    override fun f() {
        super.f()
        println("Son.f()")
    }


    inner class Grandson {
        fun g() {
            super@Son.f()
        }
    }

    override val x: Int get() = super.x + 1
}

open class ClassAndInheritance_Rectangle2 {
    open fun draw() {
        println("Drawing a rectangle")
    }
    val borderColor: String get() = "black"

}

class FilledRectangle: ClassAndInheritance_Rectangle2() {
    override fun draw() {
        super.draw()
        println("Filling the rectangle")
    }
    val fillColor: String get() = super.borderColor

    // access outer class's superclass
    inner class Filler {
        fun fill() {

        }

        fun drawAndFill() {
            super@FilledRectangle.draw()
            fill()
            println("Drawn a filled rectangle with color ${super@FilledRectangle.borderColor}")
        }
    }
}


/**
 *
 * <!-- Overriding Rules--!>
 *
 */
open class A {
    open fun f() {
        print("A")
    }

    fun a() {
        print("a")
    }
}

interface B {
    fun f() {
        print("B")
    }

    fun b() {
        print("b")
    }
}

class C : A(), B {

    override fun f() {
        super<A>.f()
        super<B>.f()
    }
}


/**
 *
 * <!-- abstract class--!>
 *
 */

open class AbstractExampleBase {
    open fun f() {

    }
}

abstract class AbstractExampleDerived : AbstractExampleBase() {

    override abstract fun f()

}

/**
 *
 * <!-- Companion Objects-- !>
 *
 */






















































































