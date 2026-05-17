package org.exampleter.kotlinSprintLesson_4

fun main() {
    var day = 5
    var isEvenDay: Boolean = day % 2 == 0
    println(
        """
         Упражнения для рук:${!isEvenDay}
         Упражнения для ног:$isEvenDay
         Упражнения для спины:$isEvenDay
         Упражнения для пресса:${!isEvenDay}
        """
    )
    day++
    isEvenDay = day % 2 == 1
    println(
        """
           Упражнения для рук: $isEvenDay
           Упражнения для ног: ${!isEvenDay}
           Упражнения для спины: ${!isEvenDay}
           Упражнения для пресса: $isEvenDay
        """
    )
}
