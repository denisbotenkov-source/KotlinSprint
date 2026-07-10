package org.exampleter.kotlinSprintLesson_16

private const val PI = 3.14

class Circle(private val radius: Double) {
    fun circumference() {
        val calculation = 2 * PI * radius
        println("Длина окружности $calculation.")
    }

    fun areaOfCircle() {
        val calculationArea = PI * radius * radius
        println("Площадь круга: $calculationArea.")
    }
}