package com.linkottut.kotlintut

fun main() {
    val cities = listOf<String>("Alexandria", "Barcelona", "Toronto", "Berlin")

//  Printout all the list content
    for (city in cities) {
        println(city)
    }

//  Printout for specific number of times (This will printout 1 to 40)
    for (i in 1 .. 4) {
        println(i)
    }

//  Printout until some number
    for (i in 1 until 5) { // minValue until maxValue
        println(i)
    }

//  While Loop
    var index = 0
    while (index < cities.size) {
        println("City at $index index is ${cities[index]}")
        index++
    }


}