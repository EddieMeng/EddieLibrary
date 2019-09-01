package com.example.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import com.example.kotlin.Basic.*
import com.example.kotlin.ClassAndObjects.DerivedClass
import com.example.kotlin.ClassAndObjects.GetterAndSetter
import com.example.kotlin.ClassAndObjects.InitOrderDemo
import com.example.kotlin.ClassAndObjects.Son
import com.example.kotlin.GettingStarted.Customer
import com.example.kotlin.GettingStarted.Ranges
import com.example.kotlin.Properties.Person
import java.util.*


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

        GettingStarted()
//        ClassAndObjectsExample()
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

    }




}
