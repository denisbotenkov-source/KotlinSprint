package org.exampleter.kotlinSprintLesson_5

import java.time.LocalDate

const val COMING_OF_AGE = 18

fun main() {
    println("Введите ваш год рождения:")
    val year = LocalDate.now().year
    val user: Int = readln().toInt()
    val calculation = year - user
    if (calculation >= COMING_OF_AGE) println("Показать экран со скрытым контентом.")
}