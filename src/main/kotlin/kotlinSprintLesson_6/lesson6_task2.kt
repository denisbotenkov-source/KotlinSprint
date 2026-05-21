package org.exampleter.kotlinSprintLesson_6

fun main() {
    println("Введите количество секунд.")
    var userSec = readln().toIntOrNull() ?: 0
    var sec = 1
    while (userSec >= sec) {
        println("Прошло ${sec++} секунд.")
        Thread.sleep(1000)
    }
}