package org.exampleter.kotlinSprintLesson_9

fun main() {
    println("Назовите 5 ингредиентов.")
    val userIngredients = List(5) { readln() }.distinct().sorted().toMutableList()
    userIngredients[0] = userIngredients[0].replaceFirstChar { it.uppercase() }
    println(userIngredients.joinToString(", "))
}