package org.exampleter.kotlinSprintLesson_4

fun main() {
    val averageMinKg = 35
    val averageMaxKg = 100
    val averageMaxLiter = 100
    val cargoKg = 20
    val cargoLiter = 80
    val cargoKgTwo = 50
    val cargoLiterTwo = 100
    println("Груз с веcом $cargoKg кг и объёмом $cargoLiter литров соответствует категории Average.${cargoKg > averageMinKg && cargoKg <= averageMaxKg && cargoLiter < averageMaxLiter} ")
    println("Груз с веcом $cargoKgTwo кг и объёмом $cargoLiterTwo литров соответствует категории Average.${cargoKgTwo > averageMinKg && cargoKgTwo <= averageMaxKg && cargoLiterTwo < averageMaxLiter}")
}