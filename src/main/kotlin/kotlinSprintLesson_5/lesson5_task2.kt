package org.exampleter.kotlinSprintLesson_5

import java.time.LocalDate

const val COMING_OF_AGE = 18

fun main() {
    println("Введите ваш год рождения:")
    val currentYear = LocalDate.now().year
    val birthYear: Int = readln().toInt()
    val age = currentYear - birthYear
    if (age >= COMING_OF_AGE) println("Показать экран со скрытым контентом.")
}