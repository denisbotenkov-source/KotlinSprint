package org.exampleter.kotlinSprintLesson_4

fun main() {
    var day = 5
    var handsAndAbsDay: Boolean = day % 2 == 1
    var legAndbackDay: Boolean = day % 2 == 0
    println(
        """
           Упражнения для рук: $handsAndAbsDay
           Упражнения для ног: $legAndbackDay
           Упражнения для спины: $legAndbackDay
           Упражнения для пресса: $handsAndAbsDay
        """
    )
    day = 6
    handsAndAbsDay = day % 2 == 1
    legAndbackDay = day % 2 == 0
    println(
        """
           Упражнения для рук: $handsAndAbsDay
           Упражнения для ног: $legAndbackDay
           Упражнения для спины: $legAndbackDay
           Упражнения для пресса: $handsAndAbsDay
        """
    )
}