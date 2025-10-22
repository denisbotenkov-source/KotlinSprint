package org.exampleter.lesson_4

import java.time.LocalDate

fun main() {
    val day = LocalDate.now().dayOfMonth
    val handsAndPress = day % 2 != 0
    val legsAndBack = !handsAndPress

    println(
        """
        |”пражнени€ дл€ рук:    $handsAndPress
        |”пражнени€ дл€ ног:    $legsAndBack
        |”пражнени€ дл€ спины:  $legsAndBack
        |”пражнени€ дл€ пресса: $handsAndPress
        """.trimMargin()
    )
}
