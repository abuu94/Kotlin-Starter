//package com.example.kotlin_starter
fun main(args: Array<String>){
    println("################################")
    println("this part is about list in Kotlin")
    val items = listOf(1,2,3,4)
    println(" First element is :"+items.first())
    println(" Last element is :"+items.last())
    println("Even Number are :"+items.filter{ it % 2 == 0})
    //hashmap
    println("#################################")
    println("this part is about Map in Kotlin")
    val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
    println(readWriteMap["foo"])
    println("#################################")
    println("this part is about Sets in Kotlin")
    //sets
    val strings = hashSetOf("a","b","c","d")
    println("My Set Values are :"+strings)

    println("#################################")
    println("this part is about Condition & loop in Kotlin")
    val i: Int =200
    for (j in 100..104)
        println(j)

    if (i in 100..1000){
        println("Tumeipata namba yako ni :"+i)

    }

}




