package org.exampleter.kotlinSprintLesson_5

fun main() {
    val numFirst = ((0..10).random())
    val numSecond = ((0..10).random())
    println("Для авторизации решите пример. $numFirst + $numSecond")
    val result = numFirst + numSecond
    val answer = readln().toIntOrNull()
    if (answer == result) println("Добро пожаловать!")
    else println("Доступ запрещён.")
}