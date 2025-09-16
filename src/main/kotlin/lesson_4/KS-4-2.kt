package org.exampleter.lesson_4

fun main() {
    val maxKg = 100
    val minKg = 35
    val liters = 100
    val cargoFirstKg = 20
    val cargoFirstLiters = 80
    val cargoSecondKg = 50
    val cargoSecondLiters = 100
    println(

        "Груз с весом $cargoFirstKg кг и $cargoFirstLiters соответствует категории 'Average':" +
                "${cargoFirstKg <= maxKg && cargoFirstKg > minKg && cargoFirstLiters < liters}"
    )


    println(

        "Груз с весом $cargoSecondKg кг и $cargoSecondLiters соответствует категории 'Average': " +
                "${cargoSecondKg <= maxKg && cargoSecondKg > minKg && cargoSecondLiters < liters}"
    )

}