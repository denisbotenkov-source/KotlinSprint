package org.exampleter.kotlinSprintLesson_14

fun main() {
    val list = listOf<Figure>(
        Circle("Чёрный", 35.0),
        Circle("Белый", 40.0),
        Circle("Белый", 25.0),
        Rectangle("Чёрный", 20.0, 40.0),
        Rectangle("Белый", 15.0, 18.0),
        Rectangle("Чёрный", 36.0, 47.0)
    )
    val blackPerimeterSum = list.filter { it.color == "Чёрный" }.sumOf { it.perimeter() }
    val whiteAreaSum = list.filter { it.color == "Белый" }.sumOf { it.area() }
    println("Сумма периметров всех чёрных фигур: $blackPerimeterSum")
    println("Сумма площадей всех белых фигур: $whiteAreaSum")
}