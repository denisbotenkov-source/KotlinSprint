package org.exampleter.lesson_4

fun main() {
    val availabilityOfSunnyWeather = true
    val outdoorAwning = true
    val theAirHumidityIs = 20
    val timeOfTheYear = "�� ����"
    val airHumidity = 20
    val currentTimeOfTheYear = "����"
    println(
        "������������� �� ������� ������ ��� ����� �������?" +
                "${
                    availabilityOfSunnyWeather && outdoorAwning && theAirHumidityIs ==
                            airHumidity && timeOfTheYear == currentTimeOfTheYear
                }"
    )
}