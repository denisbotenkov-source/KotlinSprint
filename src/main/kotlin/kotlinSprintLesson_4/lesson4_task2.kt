package org.exampleter.kotlinSprintLesson_4

const val AVERAGE_MIN_KG = 35
const val AVERAGE_MAX_KG = 100
const val AVERAGE_MAX_LITER = 100

fun main() {
    val cargoKg = 20
    val cargoLiter = 80
    val cargoWeight = 50
    val cargoVolume = 100
    println(
        "Груз с весом $cargoKg кг и объемом $cargoLiter " +
                "соответствует категории 'Average':" +
                "${cargoKg > AVERAGE_MIN_KG && cargoKg <= AVERAGE_MAX_KG && cargoLiter < AVERAGE_MAX_LITER}"
    )
    println(
        "Груз с весом $cargoWeight кг и объемом $cargoVolume " +
                "соответствует категории 'Average':" +
                "${cargoWeight > AVERAGE_MIN_KG && cargoWeight <= AVERAGE_MAX_KG && cargoVolume < AVERAGE_MAX_LITER}"
    )

}

