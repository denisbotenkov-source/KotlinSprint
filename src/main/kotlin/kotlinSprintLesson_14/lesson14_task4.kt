package org.exampleter.kotlinSprintLesson_14

fun main() {
    val planet =
        Planet("Марс", true, false, listOf(Satellite("Фобос", false, true), Satellite("Деймос", false, true)))
    println("Планета: ${planet.name},спутники: ${planet.spisokSputnikov.map { it.name }}")
}