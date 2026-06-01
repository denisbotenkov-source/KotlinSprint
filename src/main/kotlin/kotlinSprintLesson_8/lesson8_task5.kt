package org.exampleter.kotlinSprintLesson_8

fun main() {
    println("Введите количество элементов.")
    val size = readln().toIntOrNull() ?: 0
    println("назовите нужные вам элементы.")
    val ingredients = Array(size) { readln() }
    println(ingredients.joinToString(","))
}




