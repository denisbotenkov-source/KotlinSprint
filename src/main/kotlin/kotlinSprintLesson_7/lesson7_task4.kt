package org.exampleter.kotlinSprintLesson_7

fun main() {
    println("Введите количество секунд.")
    val user = readln().toIntOrNull()
    if (user != null) {
        for (i in user downTo 1) {
            println("Осталось секунд $i")
            Thread.sleep(1000)
        }
    }
    println("Время вышло.")
}