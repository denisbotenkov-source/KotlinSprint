package org.exampleter.kotlinSprintLesson_16

private const val PI = 3.14

class Circle(private val radius: Double) {
    fun calculateCircumference(): Double {
        val calculation = 2.0 * PI * radius
        return calculation
    }

    fun calculateArea(): Double {
        val calculationArea = PI * radius * radius
        return calculationArea
    }
}