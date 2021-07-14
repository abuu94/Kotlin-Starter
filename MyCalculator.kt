//package com.example.kotlin_starter
fun main(args: Array<String>){
    println("#######################")
    println("#Calculator Kotlin App#")
    println("#######################")
    var a: Int = 20
    var b:Int =5
    println("Addition is: "+myAdd(a,b))
    println("Substraction is: "+mySub(a,b))
    println("Multiplication is: "+myMult(a,b))
    println("Division is: "+myDiv(a,b))

    println("#######################")
    println("# 			END        #")
    println("#######################")
}


fun myAdd(x:Int,y:Int):Int{
    return x+y;
}

fun mySub(x:Int,y:Int):Int{
    return x-y;
}
fun myMult(x:Int,y:Int):Int{
    return x*y;
}
fun myDiv(x:Int,y:Int):Int{
    return x/y;
}

