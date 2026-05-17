package org.exampleter.kotlinSprintLesson_4

const val FAVORABLE_HUMIDITY = 20
const val REQUAIRED_SESON = "Не зима"
fun main() {
    val isAvailabilityOfSunnyWeather: Boolean = true
    val isOutdoorAwning: Boolean = true
    val airHumidity = 20
    val seasonNow = "Зима"

    val checkingConditions: Boolean =
        isAvailabilityOfSunnyWeather && isOutdoorAwning && FAVORABLE_HUMIDITY == airHumidity && REQUAIRED_SESON == seasonNow
    println("Благоприятные ли условия сейчас для роста бобовых?${checkingConditions}")
}

