package org.exampleter.kotlinSprintLesson_5

fun main() {
    println("Введите первое число")
    val userFirst = readln().toInt()
    println("Введите второе число")
    val userSecond = readln().toInt()
    val firstNumberWin = ((0..42).random())
    val secondNumberWin = ((0..42).random())
    val firstCorrect = (userFirst == firstNumberWin && userSecond == secondNumberWin) ||
            (userFirst == secondNumberWin && userSecond == firstNumberWin)
    val secondCorrect = ((userFirst == firstNumberWin || userFirst == secondNumberWin) &&
            (userSecond == firstNumberWin || userSecond == secondNumberWin)) &&
            !firstCorrect

    when {
        firstCorrect -> println("Поздравляем! Вы выиграли главный приз!Победные числа $firstNumberWin и $secondNumberWin")
        secondCorrect -> println("Вы выиграли утешительный приз.Победные числа $firstNumberWin и $secondNumberWin")
        else -> println("Неудача!Победные числа $firstNumberWin и $secondNumberWin")
    }
}





