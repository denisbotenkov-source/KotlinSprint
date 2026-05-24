package org.exampleter.kotlinSprintLesson_6

fun main() {
    println("Введите количество секунд.")
    var userSec = readln().toIntOrNull() ?: 0
    while (userSec > 0) {
        println("Осталось секунд:$userSec")
        Thread.sleep(1000)
        --userSec
    }
    println("Время вышло.")
}