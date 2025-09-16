package org.exampleter.lesson_4

fun main() {
    val reservedTableToday = 13
    val reservedTableTomorrow = 9
    val today: Boolean = reservedTableToday < NUMBER_OF_TABLES
    println("Availability of tables for today:$today")
    val tomorrow: Boolean = reservedTableTomorrow < NUMBER_OF_TABLES
    println("Availability of tables for tomorrow:$tomorrow")
}

const val NUMBER_OF_TABLES = 13
