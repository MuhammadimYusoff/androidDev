package com.linkottut.kotlintut

// Collections
fun main() {
    val city1 = "Alexandria"
    val city2 = "Barcelona"
    val city3 = "Toronto"
    val city4 = "Berlin"

//  Declaring Collections/List and by default it is Immutable
    val citiesImmutable = listOf("Alexandria", "Barcelona", "Toronto", "Berlin")
//    println("City: " + citiesImmutable[0])
//    println("City: " + citiesImmutable[2])
//    println("City: " + citiesImmutable[3])


//  You can change the type to Mutable by declaring it like below (DataType is Generic can be  change)
    val citiesMutable = mutableListOf<String>("Alexandria", "Barcelona", "Toronto", "Berlin")
    citiesMutable.add("Rome")
    println("\n\nCitiesList After Add: \n$citiesMutable")
    citiesMutable.remove(citiesMutable[1])
    println("\n\nCitiesList After Remove: \n$citiesMutable")

//  "Any" keyword for Datatype means it will accept other multiple datatype in the List
    val citiesAny = mutableListOf<Any>("Alexandria", "Barcelona", "Toronto", "Berlin")
    citiesAny.add(10) // You will get Error if the datatype is not "Any" (because only 1 datatype is allowed in a List)
    println("\n\nCitiesAny After Add: \n$citiesAny")

}