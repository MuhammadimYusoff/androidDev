package com.linkottut.kotlintut
// Operators

fun main() {
   val name: String = "Britney"
   val surname: String = "Spears"
    val fullName: String = name + (" ") + surname
//   val fullName: String = "$name $surname"
   println(fullName)

    // Other operators

    val num1: Int = 10
    val num2: Int = 5
    val addition = num1 + num2
    val subtraction = num1 - num2
    val multiplication = num1 * num2
    val division = num1 / num2
    val modulo = num1 % num2

    println("Addition of 10 and 5 = $addition")
    println("Subtraction of 10 and 5 = $subtraction")
    println("Multiplication of 10 and 5 = $multiplication")
    println("Division of 10 and 5 = $division")
    println("Modulo of 10 and 5 = $modulo")


}