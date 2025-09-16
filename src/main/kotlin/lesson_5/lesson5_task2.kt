package org.exampleter.lesson_5

fun main() {
    println("Enter the year of birth:")
    val user = readln().toInt()
    if (user > REQUIRED_YEAR_OF_BIRTH) {
        println("Age is not appropriate.")
    } else {
        println("Age is appropriate.")
    }
}

const val REQUIRED_YEAR_OF_BIRTH = 2007