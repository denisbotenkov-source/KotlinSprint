package org.exampleter.lesson_4

fun main() {
    val availabilityOfSunnyWeather = true
    val outdoorAwning = true
    val theAirHumidityIs = 20
    val timeOfTheYear = "Не Зима"
    val airHumidity = 20
    val currentTimeOfTheYear = "Зима"
    println(
        "Благоприятные ли условия сейчас для роста бобовых?" +
                "${
                    availabilityOfSunnyWeather && outdoorAwning && theAirHumidityIs ==
                            airHumidity && timeOfTheYear == currentTimeOfTheYear
                }"
    )
}