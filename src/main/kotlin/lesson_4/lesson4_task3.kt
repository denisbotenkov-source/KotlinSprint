package org.exampleter.lesson_4

fun main() {
    val theAirHumidityIs = 20
    val airHumidity = 20
    val timeOfTheYear = "�� ����"
    val currentTimeOfTheYear = "����"

    val conditionsAreGood =
        (AVAILAB_ILITYOf_SUNNY_WEATHER == true) &&
                (OUTDOOR_AWNING == true) &&
                (theAirHumidityIs == airHumidity) &&
                (timeOfTheYear == currentTimeOfTheYear)

    println("������������� �� ������� ������ ��� ����� �������? $conditionsAreGood")
}

const val AVAILAB_ILITYOf_SUNNY_WEATHER = true
const val OUTDOOR_AWNING = true