package org.exampleter.kotlinSprintLesson_11

fun main() {

}

class Category(
    val name: String,
    val description: String,
)

class Recipe(
    val text: String,
    val title: String,
    val ingredients: List<Ingredient>,
    val Id: Int,
)

class Ingredient(
    val name: String,
    val unit: String,
    val quantity: Double,
)