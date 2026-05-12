package org.exampleter.kotlinSprintLesson_4

fun main() {
    val availabilityOfSunnyWeather: Boolean = true
    val outdoorAwning: Boolean = true
    val airHumidity = 20
    val season = "Зима"

    val checkingConditions: Boolean =
        availabilityOfSunnyWeather && outdoorAwning && airHumidity == 20 && season != "Зима"

    println("Благоприятные ли условия сейчас для роста бобовых?${checkingConditions}")


}