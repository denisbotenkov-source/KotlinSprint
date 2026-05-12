package org.exampleter.kotlinSprintLesson_4

const val NUMBER_OF_TABLES = 13
fun main() {
    val bookedToday = 13
    val bookedTomorrow = 9
    val freeTablesToday: Boolean = bookedToday < NUMBER_OF_TABLES
    val freeTablesTomorrow: Boolean = bookedTomorrow < NUMBER_OF_TABLES
    println("Доступность столиков на сегодня:$freeTablesToday.\n Доступность столиков на завтра:$freeTablesTomorrow. ")
}
