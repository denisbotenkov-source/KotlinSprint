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

        "���� � ����� $cargoFirstKg �� � $cargoFirstLiters ������������� ��������� 'Average':" +
                "${cargoFirstKg <= maxKg && cargoFirstKg > minKg && cargoFirstLiters < liters}"
    )


    println(

        "���� � ����� $cargoSecondKg �� � $cargoSecondLiters ������������� ��������� 'Average': " +
                "${cargoSecondKg <= maxKg && cargoSecondKg > minKg && cargoSecondLiters < liters}"
    )

}