package org.exampleter.kotlinSprintLesson_15

class Temperature(private val temperature: Double) : WeatherStationStats() {
    override fun show() {
        println("Температура $temperature. ")
    }
}