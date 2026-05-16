package org.exampleter.kotlinSprintLesson_4

fun main() {
    println("Имеет ли корабль повреждения?")
    val isShipDamage: Boolean = readLine()?.toBoolean() ?: false
    println("Количество людей на борту?")
    val currentSquad = readLine()?.toInt() ?: 0
    println("Количество ящиков на борту?")
    val numberOfMailboxes = readLine()?.toInt() ?: 0
    println("Благоприятна ли погода?")
    val isFavorableWeatherConditions: Boolean = readLine()?.toBoolean() ?: true
    val message = (!isShipDamage && currentSquad in 55..70 && numberOfMailboxes > 50) ||
            (isShipDamage && currentSquad == 70 && numberOfMailboxes >= 50 && isFavorableWeatherConditions)
    println("Корабль готов к отплытию. $message")

}