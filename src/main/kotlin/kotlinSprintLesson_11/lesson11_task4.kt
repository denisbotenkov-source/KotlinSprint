package org.exampleter.kotlinSprintLesson_11

fun main() {

}

class Category(
    val name: String,
    val description: String,
    val imageUrl: String,
)

class Recipe(
    val id: Int,
    val text: String,
    val title: String,
    val imageUrl: String,
    val steps: List<String>,
    val ingredients: List<Ingredient>,
    val category: Category,
)

class Ingredient(
    val name: String,
    val unit: String,
    val quantity: String,
)