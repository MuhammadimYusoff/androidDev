package com.linkottut.kotlintut

fun main() {
//    We have to add ? at the end of datatype to indicate null safety feature
//    This means the value can be null (but no method return is null. NO!)
    val data: String? = null
  val dataNotNull: String? = "Students Data Completed!"

    if (dataNotNull != null) {
        println(dataNotNull.lowercase())
    }

//  Other way to use call it can be like below:
//  We will call the data if it's not null and print it out.
    println(dataNotNull?.uppercase())
}