package org.exampleter.lesson_5

fun main() {
    println("Enter two numbers:")
    val userFirst = readln().toIntOrNull()
    val userSecond = readln().toIntOrNull()
    val firstMatch = userFirst == NUMBER_FIRST || userFirst == NUMBER_SECOND
    val secondMatch = userSecond == NUMBER_FIRST || userSecond == NUMBER_SECOND

    if (firstMatch && secondMatch) {
        println("Congratulations! You have won the grand prize!")
    } else if (firstMatch || secondMatch) {
        println("You've won a consolation prize!")
    } else {
        println("You guessed wrong!")
    }
    println("Winning numbers were: $NUMBER_FIRST and $NUMBER_SECOND")
}

const val NUMBER_FIRST = 19
const val NUMBER_SECOND = 27