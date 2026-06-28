package org.exampleter.kotlinSprintLesson_14

class Rectangle(color: String, val width: Double, val height: Double) : Figure(color) {
    override fun area(): Double {
        return width * height
    }

    override fun perimeter(): Double {
        return 2 * (width + height)
    }
}