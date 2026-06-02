package org.example.kotlinSprintLesson_9

const val EGGS_INDEX = 0
const val MILK_INDEX = 1
const val BUTTER_INDEX = 2


fun main() {
    val portionsForOne = listOf<Int>(2, 50, 15)
    println("Введите количество порций.")
    val user = readln().toIntOrNull() ?: 0
    val portionsForUser = portionsForOne.map { it * user }
    println(
        "На количество порций $user ,вам понадобится: Яиц - ${portionsForUser[EGGS_INDEX]}, молока - ${portionsForUser[MILK_INDEX]}, " +
                "сливочного масла - ${portionsForUser[BUTTER_INDEX]} "
    )
}