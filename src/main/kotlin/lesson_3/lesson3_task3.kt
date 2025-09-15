package org.exampleter.lesson_3

fun main() {
    val firstNumber = 5
    val maxNumber = 10
    val result = mutableListOf<Int>()
    for (i in 1..maxNumber) {
        result.add(i * firstNumber)
    }
    println(result)
}
