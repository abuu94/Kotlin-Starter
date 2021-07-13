package com.example.kotlin_starter
fun main(args: Array<String>){

    println("Hello World, .......")
    val a: Int = 100
    println("The value od a is :"+ a);
    val b: Double = 10.9
    println("The value of b is :" + b);
    val letter: Char
    letter = 'C'
    //println("Your Character is :$`$letter`");
    println("$letter");
    val escString: String = "Mimi ni String na Escape\n"
    var rawString: String = "Mimi ni Mwanafunzi"

    println(rawString);
    println(escString);

    val number: IntArray = intArrayOf(1,2,3,4,5)
    println("I am element number 1: "+number[0]);
    println("I am element number 2: "+number[1]);
    println("I am element number 3:"+number[2]);

    val numbers: MutableList<Int> = mutableListOf(1,2,3)
    val readOnlyView: List<Int> = numbers
    println("List "+numbers)
    println("Mutable List 1 :"+numbers[1]);
    println("Mutable List 2: "+numbers[2]);
    println("Mutable List 3: "+numbers[0]);
}