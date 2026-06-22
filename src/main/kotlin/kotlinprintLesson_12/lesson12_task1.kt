package org.exampleter.kotlinprintLesson_12

fun main() {
    val dayWeather = OneDayWeather()
    dayWeather.dayTemperature = 25
    dayWeather.nightTemperature = 15
    dayWeather.hasPrecipitation = false
    dayWeather.print()
    val daySecondWeather = OneDayWeather()
    daySecondWeather.dayTemperature = 20
    daySecondWeather.nightTemperature = 13
    daySecondWeather.hasPrecipitation = true
    daySecondWeather.print()
}


class OneDayWeather() {
    var dayTemperature: Int = 0
    var nightTemperature: Int = 0
    var hasPrecipitation: Boolean = true

    fun print() {
        println("Дневная температура: $dayTemperature, Ночная температура: $nightTemperature, Наличие осадков $hasPrecipitation")
    }
}