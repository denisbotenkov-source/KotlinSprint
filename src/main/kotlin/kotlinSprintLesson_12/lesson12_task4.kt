package org.exampleter.kotlinSprintLesson_12

fun main() {
    val sensor = Sensor(36.6)
}

class Sensor(val temp: Double) {
    init {
        require(temp >= -273.15) { "Температура $temp ниже абсолютного нуля" }
        println("$temp")
    }
}