package org.example.kotlinSprintLesson_4

const val FAVORABLE_HUMIDITY = 20
const val REQUIRED_SEASON = "Зима"

fun main() {
    val isSunny: Boolean = true
    val isOutdoorAwning: Boolean = true
    val airHumidity = 20
    val seasonNow = "Не зима"

    val checkingConditions: Boolean =
        isSunny && isOutdoorAwning && FAVORABLE_HUMIDITY == airHumidity && REQUIRED_SEASON != seasonNow
    println("Благоприятные ли условия сейчас для роста бобовых? ${checkingConditions}")
}