package org.exampleter.kotlinSprintLesson_4

fun main(){
    val isAvailabilityOfSunnyWeather: Boolean = true
    val isOutdoorAwning: Boolean = true

    val checkingConditions: Boolean =
        isAvailabilityOfSunnyWeather && isOutdoorAwning && AIR_HUMIDITY == 20 && SEASON != "Зима"
    println("Благоприятные ли условия сейчас для роста бобовых?${checkingConditions}")
}

const val AIR_HUMIDITY = 20
const val SEASON = "Зима"