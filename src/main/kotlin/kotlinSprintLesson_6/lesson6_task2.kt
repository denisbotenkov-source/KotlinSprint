package org.exampleter.kotlinSprintLesson_6

fun main() {
    println("Введите количество секунд.")
    val userSec = readln().toIntOrNull() ?: 0
    Thread.sleep(userSec * 1000L)
        println("Прошло $userSec секунд.")
}