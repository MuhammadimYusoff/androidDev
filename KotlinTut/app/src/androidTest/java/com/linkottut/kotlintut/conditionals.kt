package com.linkottut.kotlintut

fun main() {
    val myAge = 17
    if (myAge >= 18) {
        println("Simple \nYou can Smoke the BBQ!")
    } else {
        println("Simple \nYou can't Smoke the BBQ yet!")
    }

//    better way you can write the code using ternary (not good lol)
    if (myAge >= 18) println("\n\nTernary \nyou can Smoke BBQ!")
        else println("\n\nTernary \n You can't smoke BBQ...")

}