package org.exampleter.lesson_4

import java.time.LocalDate

fun main() {
    val day = LocalDate.now().dayOfMonth
    val handsAndPress = day % 2 != 0
    val legsAndBack = !handsAndPress

    println(
        """
        |���������� ��� ���:    $handsAndPress
        |���������� ��� ���:    $legsAndBack
        |���������� ��� �����:  $legsAndBack
        |���������� ��� ������: $handsAndPress
        """.trimMargin()
    )
}
