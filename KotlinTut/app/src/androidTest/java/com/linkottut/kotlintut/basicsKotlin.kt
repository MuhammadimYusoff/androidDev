package com.linkottut.kotlintut//

fun main() {
//    println("Hello World!")
//    print("line 2")
//    print("line 3")

    // val (not specific) = const in js,value can't be change
    // Below: <dataType> <varName>: <dataType> = <value>
    val myName: String = "Yusoff" // green means String
    // val myName = "Bek"

    // var = let
    var myAge: Int = 40 // blue means integer
    // var myAge = 40

//  print out the value
    println("My Name: " + myName + "\nMy Age: " + myAge)

    var hugeInt: Int = Int.MAX_VALUE
    var tinyInt: Int = Int.MIN_VALUE

    println("Maximum Int: " + hugeInt) // not recommended
    println("Minimum Int: $tinyInt") // using String Interpolation


    var hugeLong: Long = Long.MAX_VALUE
    var tinyLong: Long = Long.MIN_VALUE

    println("Maximum Long: " + hugeLong) // not recommended
    println("Minimum Long: $tinyLong") // using String Interpolation


    var hugeDouble: Double = Double.MAX_VALUE
    var tinyDouble: Double = Double.MIN_VALUE

    println("Maximum Double: " + hugeDouble) // not recommended
    println("Minimum Double: $tinyDouble") // using String Interpolation
}