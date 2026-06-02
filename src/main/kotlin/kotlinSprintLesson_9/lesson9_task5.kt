package org.example.kotlinSprintLesson_9

fun main() {
    println("Назовите 5 ингредиентов.")
    var userIngredients = List(5) { readln() }.toSet().sorted()
    userIngredients = userIngredients.mapIndexed { index, item ->
        if (index == 0) item.replaceFirstChar {
            it.uppercase()
        } else item
    }
    println(userIngredients.joinToString(separator = ", ", postfix = "."))
}