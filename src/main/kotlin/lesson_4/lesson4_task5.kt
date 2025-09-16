package org.exampleter.lesson_4

fun main() {
    val damageToTheHousing = readln()!!.toBoolean()
    val currentCrewComposition = readln()!!.toInt()
    val cratesOfProvisions = readln()!!.toInt()
    val favorableWeatherConditions = readln()!!.toBoolean()
    val minorDamage = readLine()!!.toBoolean()
    val checkingTheShip =
        (!damageToTheHousing && currentCrewComposition in 55..70 && cratesOfProvisions > 50) ||
                (damageToTheHousing && minorDamage && currentCrewComposition == 70 && favorableWeatherConditions)
    println("Научно-исследовательский корабль может приступить к долгосрочному плаванию: $checkingTheShip")
}