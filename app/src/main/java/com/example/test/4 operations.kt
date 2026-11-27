package com.example.test

// ADDITION
fun additionner(terme1: Int, terme2: Int): Int {
    return terme1 + terme2
}

// MULTIPLICATION
fun multiplication(num1: Int, num2: Int): Int {
    return num1 * num2
}

// DIVISION
fun diviserNombre(dividante: Int, diviseur: Int): Int {
    return try {
        dividante / diviseur
    } catch (_: ArithmeticException) {
        println("Veuillez entrer un nombre supérieur à zéro")
        0
    }
}

// SOUSTRACTION
fun soustraire(nombre1: Int, nombre2: Int): Int {
    return nombre1 - nombre2
}

// CALCULATRICE SELON L'OPÉRATEUR (+, -, *, /)
fun executerOperation(x: Int, y: Int, operation: String): Int? {
    return when (operation.trim()) {
        "+" -> additionner(x, y)
        "-" -> soustraire(x, y)
        "*" -> multiplication(x, y)
        "/" -> diviserNombre(x, y)
        else -> {
            println("Opérateur inconnu : '$operation'. Utilisez '+', '-', '*' ou '/'.")
            null
        }
    }
}

fun main() {
    println("6 + 5 = ${executerOperation(6, 5, "+")}")
    println("6 - 5 = ${executerOperation(6, 5, "-")}")
    println("6 * 5 = ${executerOperation(6, 5, "*")}")
    println("6 / 5 = ${executerOperation(6, 5, "/")}")
    println("6 / 0 = ${executerOperation(6, 0, "/")}")
    println("6 ? 5 = ${executerOperation(6, 5, "?")}")
}