package com.example.test

fun main ()
{
    try {
    val numbers = listOf(10, 20, 30)
    val number = numbers[5]
    println(number)
    }
    catch (e: IndexOutOfBoundsException)
    {
        println("L'index n'est pas trouvable")
    }
}



