package org.exampleter.kotlinSprintLesson_5

fun main() {
    println("Введите первое число")
    val userFirst = readln().toIntOrNull()
    println("Введите второе число")
    val userSecond = readln().toIntOrNull()
    val firstNumberWin = 5
    val secondNumberWin = 19
    val firstCorrect = (userFirst == firstNumberWin && userSecond == secondNumberWin) ||
            (userFirst == secondNumberWin && userSecond == firstNumberWin)
    val secondCorrect = ((userFirst == firstNumberWin || userFirst == secondNumberWin) &&
            (userSecond == firstNumberWin || userSecond == secondNumberWin)) &&
            !firstCorrect

    when {
        firstCorrect -> println("Поздравляем! Вы выиграли главный приз!")
        secondCorrect -> println("Вы выиграли утешительный приз.")
        else -> println("Неудача!")
    }
}





