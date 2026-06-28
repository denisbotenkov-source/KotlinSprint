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
    val (avgNight, avgDay) = calculateTemp(monthlyWeather)
    val daysWithRain = countRainyDays(monthlyWeather)

    println("Средняя ночная температура: $avgNight")
    println("Средняя дневная температура: $avgDay")
    println("Дней с осадками: $daysWithRain")
}

class MonthlyWeather(val nightTemperature: Double, val dayTemperature: Double, val hasRain: Boolean)

fun countRainyDays(month: List<MonthlyWeather>): Int {
    return month.count { it.hasRain }
}

fun calculateTemp(month: List<MonthlyWeather>): Pair<Double, Double> {
    val avgNight = month.map { it.nightTemperature }.average()
    val avgDay = month.map { it.dayTemperature }.average()
    return Pair(avgNight, avgDay)
}
