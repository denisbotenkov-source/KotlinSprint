package org.exampleter.kotlinSprintLesson_11

fun main() {

}

class Category(
    val nazvanie: String,
    val opisanie: String,

    )

class Recept(
    val tekstRecept: String,
    val nazvanieBluda: String,
    val ingredients: MutableList<Ingredient>,
    val category: Category,
)

class Ingredient(
    val nazvanie: String,
    val edinicaIzmereniya: String,
    val kolichestvo: Double,
)
