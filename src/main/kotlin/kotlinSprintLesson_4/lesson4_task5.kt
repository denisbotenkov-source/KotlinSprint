package org.exampleter.kotlinSprintLesson_4

fun main() {
    println("Имеет ли корабль повреждения?")
    val isShipDamage: Boolean = readln()?.toBoolean() ?: false
    println("Количество людей на борту?")
    val currentSquad = readln()?.toInt() ?: 0
    println("Количество ящиков на борту?")
    val numberOfBoxes = readln()?.toInt() ?: 0
    println("Благоприятна ли погода?")
    val isFavorableWeatherConditions: Boolean = readln()?.toBoolean() ?: true
    val isReadyToSail = (!isShipDamage && currentSquad in 55..70 && numberOfBoxes > 50) ||
            (isShipDamage && currentSquad == 70 && numberOfBoxes >= 50 && isFavorableWeatherConditions)
    println("Корабль готов к отплытию. $isReadyToSail")

}