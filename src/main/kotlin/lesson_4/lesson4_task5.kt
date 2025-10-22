package org.exampleter.lesson_4

fun main() {
    val damageToTheHousing = readln()!!.toBoolean()
    val currentCrewComposition = readln()!!.toInt()
    val cratesOfProvisions = readln()!!.toInt()
    val favorableWeatherConditions = readln()!!.toBoolean()
    val minorDamage = readLine()!!.toBoolean()
    val checkingTheShip =
        (damageToTheHousing != SHIP_DAMAGED && currentCrewComposition in MIN_CREW_SIZE..MAX_CREW_SIZE && cratesOfProvisions > MIN_PROVISIONS_CRATES) ||
                (damageToTheHousing == SHIP_DAMAGED && minorDamage == MINOR_DAMAGE_PRESENT && currentCrewComposition == MAX_CREW_SIZE && favorableWeatherConditions == WEATHER_FAVORABLE)
    println("Научно-исследовательский корабль может приступить к долгосрочному плаванию: $checkingTheShip")
}

const val MIN_CREW_SIZE = 55
const val MAX_CREW_SIZE = 70
const val MIN_PROVISIONS_CRATES = 50
const val SHIP_DAMAGED = true
const val WEATHER_FAVORABLE = true
const val MINOR_DAMAGE_PRESENT = true


