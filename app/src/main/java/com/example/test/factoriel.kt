package com.example.test

//2. Deuxieme coding exercice
//Utiliser une boucle pour calculer le factoriel d'un
//nombre soit n! = n * (n - 1)!.
//verifier que votre algorithme est correcte avec 5!
//par ex.
fun factoriel(n: Int): Long {
    require(n >= 0) { "Le nombre doit être supérieur ou égal à 0." }

    var resultat: Long = 1
    for (i in 1..n) {
        resultat *= i
    }
    return resultat
}

fun main() {
    val n = 5
    val res = factoriel(n)
    println("Apres le calcul, la factoriel de $n! est de $res")
}