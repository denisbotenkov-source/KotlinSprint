package org.exampleter.kotlinSprintLesson_12

fun main() {
    val weatherFirst = Weather(25, 20, true)
    weatherFirst.print()
}

class Weather(var dayTemperature: Int, var nightTemperature: Int, var hasPrecipitation: Boolean) {
    fun print() {
        println("Дневная температура: $dayTemperature, Ночная температура: $nightTemperature, Наличие осадков $hasPrecipitation")
    }
}