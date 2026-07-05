package org.exampleter.kotlinSprintLesson_15

class PrecipitationAmount(private val precipitationAmount: Int) : WeatherStationStats() {
    override fun show() {
        println("Количество осадков: $precipitationAmount мм.")
    }

}
