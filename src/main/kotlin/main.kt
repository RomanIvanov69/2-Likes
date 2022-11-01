package ru.netology

fun main() {
    val likes = 115

    val ending = if (likes % 100 == 11) {
        "людям"
    } else if (likes % 10 == 1) "человеку" else {
        "людям"
    }
    println("Понравилось $likes $ending")
}
