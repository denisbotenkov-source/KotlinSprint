package org.exampleter.lesson_5

fun main() {
    val numFirst = 4
    val numSecond = 7
    val result = numSecond + numFirst
    println("Solve the example:$numFirst+$numSecond")
    val user = readln().toInt()
    if (user == result) {
        println("Verification completed.")
    } else {
        println("Verification failed.")
    }

}