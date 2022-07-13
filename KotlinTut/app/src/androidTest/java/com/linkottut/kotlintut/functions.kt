package com.linkottut.kotlintut

fun sayHello() {
    println("Hello World from sayHello()")
}

fun sayHelloToSomeone(name: String) {
    println("Hello, $name")
}

fun add(): Int {
    return 20 + 30
}
// The whole function can be rewrite in a single line:-
 fun addInline() : Int = 70+ 30

// Function with arguments
fun divide(x:Int, y:Int): Int = x / y

// Private Function
private fun privateSayHello(name: String) {
    println("Privately Say Hello to $name")
}

fun main() {
    sayHello()
    sayHelloToSomeone("John. This is from sayHelloToSomeone()")
    println("\nSum of 20 + 30: ${add()}")
    println("\nSum of 70 + 30: ${addInline()}")
    println("\nDivision of 100 / 50: ${divide(100,50)}")
    privateSayHello("Ma Future")
    println(privateSayHello("Ma Future println()")) // HOW IS THIS EVEN POSSIBLE???
}