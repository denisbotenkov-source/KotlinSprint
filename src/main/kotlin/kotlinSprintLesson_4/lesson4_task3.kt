package org.exampleter.kotlinSprintLesson_4

const val HUMIDITY = 20
const val SEASON_NOW = "Зима"
fun main() {
    val isAvailabilityOfSunnyWeather: Boolean = true
    val isOutdoorAwning: Boolean = true
    val airHumidity = 20
    val season = "Не зима"

    val checkingConditions: Boolean =
        isAvailabilityOfSunnyWeather && isOutdoorAwning && airHumidity == HUMIDITY && season != SEASON_NOW
    println("Благоприятные ли условия сейчас для роста бобовых?${checkingConditions}")
}

