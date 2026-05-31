package org.exampleter.kotlinSprintLesson_9

fun main() {
    val portionsForOne = listOf<Int>(2, 50, 15)
    println("Введите количество порций.")
    val user = readln().toIntOrNull() ?: 0
    val portionsForUser = portionsForOne.map { it * user }
    println(
        "На количество порций $user,вам понадобится: Яиц - ${portionsForUser[0]}, молока - ${portionsForUser[1]}, " +
                "сливочного масла - ${portionsForUser[2]} "
    )
}