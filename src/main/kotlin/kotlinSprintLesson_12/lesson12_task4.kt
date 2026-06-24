package org.exampleter.kotlinSprintLesson_12

const val CELSIUM_ED = 273
fun main() {
    val converter = Converter(300)

}

class Converter(kelvin: Int) {
    init {
        val celsius = kelvin - CELSIUM_ED
        println(celsius)
    }
}