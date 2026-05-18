package org.exampleter.kotlinSprintLesson_4

const val CREW_MIN = 55
const val CREW_MAX = 70
const val PROVISION_MIN = 50

fun main() {
    println("Имеет ли корабль повреждения?")
    val isShipDamage: Boolean = readln().toBoolean()
    println("Количество людей на борту?")
    val currentSquad = readln()?.toInt() ?: 0
    println("Количество ящиков на борту?")
    val numberOfBoxes = readln()?.toInt() ?: 0
    println("Благоприятна ли погода?")
    val isFavorableWeatherConditions: Boolean = readln()?.toBoolean() ?: true
    val isReadyToSail = (!isShipDamage && currentSquad in CREW_MIN..CREW_MAX && numberOfBoxes > PROVISION_MIN) ||
            (isShipDamage && currentSquad == 70 && numberOfBoxes >= 50 && isFavorableWeatherConditions)
    println("Корабль готов к отплытию. $isReadyToSail")

}