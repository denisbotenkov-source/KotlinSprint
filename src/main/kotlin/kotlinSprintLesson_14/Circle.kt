package org.exampleter.kotlinSprintLesson_14

class Circle(color: String, val radius: Double) : Figure(color) {
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2.0 * Math.PI * radius
    }
}