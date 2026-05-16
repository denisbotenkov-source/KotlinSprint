package org.exampleter.kotlinSprintLesson_5

fun main() {
    println("Для авторизации решите пример.10 + 5")
    val answer = readln().toIntOrNull()
    if (answer == 15) println("Добро пожаловать!")
    else println("Доступ запрещён.")
}