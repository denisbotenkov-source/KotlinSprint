package org.exampleter.lesson_2


fun main() {

    val departureHour = 9
    val departureMinute = 39
    val travelTimeMinutes = 457
    val departureTotalMinutes = departureHour * 60 + departureMinute
    val arrivalTotalMinutes = departureTotalMinutes + travelTimeMinutes
    val arrivalHour = (arrivalTotalMinutes / minuteInHour) % hoursPerDay
    val arrivalMinute = arrivalTotalMinutes % 60
    println("The train arrives at: ${"%02d".format(arrivalHour)}:${"%02d".format(arrivalMinute)}")
}

const val minuteInHour = 60
const val hoursPerDay = 24