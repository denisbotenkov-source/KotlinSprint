package org.exampleter.kotlinSprintLesson_9

fun main() {
    println("Введите 5 ингредиентов.")
    val user = readln()
    val userIngredients = user.split(", ")
    println("${userIngredients.sorted()}")
}