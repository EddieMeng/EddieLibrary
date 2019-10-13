package com.example.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.kotlin.ClassAndObjects.*
import com.example.kotlin.FunctionsAndLambds.asList
import com.example.kotlin.FunctionsAndLambds.foo
import com.example.kotlin.FunctionsAndLambds.reformat
import com.example.kotlin.GettingStarted.Customer
import com.example.kotlin.GettingStarted.Ranges
import com.example.kotlin.FunctionsAndLambds.*

/**
 * Compatibility
 *
 *
 * Performance : run as fast as java code, kotlin support inline function, code using lambdas might run faster than java code.
 *
 * Interoperability : 100% interoperable with java, allowing to use all existing android libraries.
 *
 * Footprint :
 *
 * Compilation Time :
 *
 * Learning Curve :
 *
 *
 */


typealias AInner = TypeAliases_A.Inner


class MainActivity : AppCompatActivity() {
    private val items = listOf(
            "Mon 6/23 - Sunny - 31/17",
            "Tue 6/24 - Foggy - 21/8",
            "Wed 6/25 - Cloudy - 22/17",
            "Thurs 6/26 - Rainy - 18/11",
            "Fri 6/27 - Foggy - 21/10",
            "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
            "Sun 6/29 - Sunny - 20/7")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // NULL SAFETY
//        var artist : Artist? = null
//        artist.toString();
//        niceToast(tag = "tag", length = 50)
//
//        var forecastList = findViewById(R.id.forecast_list) as RecyclerView
//        forecastList.layoutManager = LinearLayoutManager(this)
//        forecastList.adapter = ForecastListAdapter(items)
//
//        var i: Int = 7;
//        var d: Double = i.toDouble()
//
//        var c: Char = 'C';
//        var i2: Int = c.toInt()
//
//        var flag1: Int = 0xff;
//        var flag2: Int = 0x01;
//
//        var bitwiseOr = flag1 or flag2
//        var bitwiseAnd = flag1 and flag2
//
//        var integer = 12;
//        var integerHex = 0x0f
//        var long = 3L
//        var double = 3.5
//        var float = 3.5F
//
//        var s = "Example"
//        var character = s[2]
//
//        for (character in s) {
//            print(character)
//        }
//
//        val person = Person()
//        person.name = "IronMan"
//
//        val name = person.name
//
//        var ramdom = Ramdom(Person())
//        ramdom.ramdom()

//        var basic = BasicTypes()
//        var contrlFlow = IfExample()
//        var whenFlow = WhenExample()
//        var forLoopEx = ForLoopExample()
//        var returnAndJump = BreakAndContinueLabel()
//        var returnAtLables = ReturnAtLabels()
//        var orderDemo = InitOrderDemo("Kitty")


//        GettingStarted()
//        ClassAndObjectsExample()
        Review_ClassAndObjects()
//        FunctionsAndLambds()
    }

    fun GettingStarted() {
        var range = Ranges()
        range.overProgressionDownTo()

        var dataClass = Customer("", "")
    }


    fun ClassAndObjectsExample() {
//        var derivedInstance = DerivedClass("Meng", "Simon")
//        var son = Son()
//        println(son.f())
//        println(son.x)

        var getterAndSetter = GetterAndSetter()
        getterAndSetter.stringRepresentation = "baby"
//        getterAndSetter.setterVisibility = "abc"
        println(getterAndSetter.stringRepresentation)

        var visiblityInstance = Cons(5)
        printClassName(Rectangle())

        var example = Example()
        example.printFunctionType()

        var nullVariable: Any? = null
        nullVariable.toString()

        MyClass.printCompanion()

        var list = listOf("red", "green", "blue")
        list.getLongestString()

        var connection = Connection(Host("kotl.in"), 443)
        connection.connect()

        val person1 = DataClasses_Person("John", 40)
        val person2 = DataClasses_Person("Rose Marry", 50);
        println(person1.toString())

        val jack = DataClasses_Person("Jack", 1)
        val oldJack = jack.copy(age = 2)

        val nestValue = NestedClasses_Outer.nested().foo()
        val innerValue = NestedClasses_Outer().Inner().foo()
        println(nestValue)
        println(innerValue)

        val arrayOfEnum = EnumClass.values()
        val one = EnumClass.valueOf("ONE")
        println(one)

        printAllValues<RGB>()

        var ab: Objects_A = object : Objects_A(1), B {
            override val y = 15
        }
        println(ab.y)

        val myClass = Objects_MyClass()
        val myClass2 = Objects_MyClass.create()

        val myClass3 = Objects_MyClass
        val f: Factory<Objects_MyClass> = Objects_MyClass

        val name = Name("kotlin")
        name.greet()
        println(name.length)
    }

    fun FunctionsAndLambds() {
        //named arguments
        foo(baz = 5)

        reformat("str")
        reformat("str", true, true, false, ' ')
        reformat(str = "str", normalizeCase = true, upperCaseFirstLetter = true, divideByCamelHumps = true, wordSeparator = '_')
        reformat(str = "str", divideByCamelHumps = true)
        reformat("str", normalizeCase = true)

        val a = arrayOf(4, 5, 6)
        asList(1, 2, *a, 3)

        1 shl 2

        val items = listOf(1, 2, 3, 4)

        items.fold(0, { acc: Int, i: Int ->
            print("acc = $acc, i = $i, ")
            val result = acc + i
            println("result = $result")
            result
        })

        val joinedToString = items.fold("Elements", { acc, i ->
            acc + " " + i
        })

        val product = items.fold(1, Int::times)
    }

    fun Review_ClassAndObjects() {
        val derivedClass = DerivedClass("Potter", "Harry")
        val user: User = User()
        user.firstname
    }




}
