package org.exampleter.kotlinSprintLesson_8

fun main() {
    val ingredients =
        arrayOf("Свёкла", "Капуста", "Морковь", "Лук", "Картофель", "Мясо", "Томат").map { it.lowercase() }
    println("Введите название ингредиента.")
    val user = readln().lowercase()
    if (user in ingredients) {
        println("Ингредиент $user есть в рецепте.")
    } else {
        println("Ингредиента нет в рецепте.")
    }
}