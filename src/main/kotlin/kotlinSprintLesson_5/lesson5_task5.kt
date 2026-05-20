package org.exampleter.kotlinSprintLesson_5

fun main() {
    val winningNumbers = (0..42).shuffled().take(3)
    val userNumbers = mutableListOf<Int>()

    println("Введите первое число от 0 до 42 ")
    val numberFirst = readln().toIntOrNull() ?: 0
    userNumbers.add(numberFirst)
    println("Введите второе число.")
    val numberSecond = readln().toIntOrNull() ?: 0
    userNumbers.add(numberSecond)
    println("Введите третье число.")
    val numberThree = readln().toIntOrNull() ?: 0
    userNumbers.add(numberThree)
    val check = userNumbers.intersect(winningNumbers)
    val matches = check.size
    when (matches) {
        3 -> println("Вы угадали все числа и выйграли джекпот!")
        2 -> println("Вы угадали два числа и получаете крупный приз!")
        1 -> println("Вы угадали одно число и получаете утешительный приз!")
        0 -> println("Вы не угадали ни одного числа.")
    }
    println("Числа для выйгрыша были $winningNumbers")
}