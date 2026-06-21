package org.exampleter.kotlinSprintLesson_12

fun main() {
    val converter = Converter(300)
    converter.print()
}

class Converter(kelvin: Int) {
    val celsius = kelvin - 273

    fun print() {
        println("$celsius")
    }
}