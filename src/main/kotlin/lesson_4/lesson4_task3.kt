package org.exampleter.lesson_4

fun main() {
    val theAirHumidityIs = 20
    val timeOfTheYear = "�� ����"
    val airHumidity = 20
    val currentTimeOfTheYear = "����"
    println(
        "������������� �� ������� ������ ��� ����� �������?" +
                "${
                    AVAILAB_ILITYOf_SUNNY_WEATHER && OUTDOOR_AWNING && theAirHumidityIs ==
                            airHumidity && timeOfTheYear == currentTimeOfTheYear
                }"
    )
}

const val AVAILAB_ILITYOf_SUNNY_WEATHER = true
const val OUTDOOR_AWNING = true