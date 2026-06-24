package org.exampleter.kotlinSprintLesson_12

import kotlin.random.Random

fun main() {
    val monthlyWeather = mutableListOf<MonthlyWeather>()
    for (i in 1..30) {
        val dayTemp = Random.nextDouble(-15.0, 35.0)
        val nightTemp = Random.nextDouble(-15.0, 35.0)
        val hasRain = Random.nextBoolean()
        val weather = MonthlyWeather(nightTemp, dayTemp, hasRain)
        monthlyWeather.add(weather)
    }
    val avgNight = averageNightTemp(monthlyWeather)
    val avgDay = calculateAverageDayTemp(monthlyWeather)
    val daysWithRain = countRainyDays(monthlyWeather)

    println("Средняя ночная температура: $avgNight")
    println("Средняя дневная температура: $avgDay")
    println("Дней с осадками: $daysWithRain")
}

class MonthlyWeather(val temperaturaNochiu: Double, val temperaturaDnem: Double, val osadki: Boolean)

fun averageNightTemp(month: List<MonthlyWeather>): Double {
    return month.map { it.temperaturaNochiu }.average()
}

fun countRainyDays(month: List<MonthlyWeather>): Int {
    return month.count { it.osadki }
}

fun calculateAverageDayTemp(month: List<MonthlyWeather>): Double {
    return month.map { it.temperaturaDnem }.average()
}