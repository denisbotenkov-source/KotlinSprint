package org.exampleter.kotlinSprintLesson_7

fun main() {
    println("Введите число.")
    val user = readln().toIntOrNull()
    if (user != null) {
        for (num in 0..user step 2) {
            println(num)
        }
    }
}