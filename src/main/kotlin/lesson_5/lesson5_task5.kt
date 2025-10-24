package org.exampleter.lesson_5

import kotlin.random.Random

fun main() {
    val size = 3
    val randomList: List<Int> = List(size) { Random.nextInt(0, 42) }
    println("Enter $size numbers separated by a space.")
    val userList: List<Int> = readln()
        .split(' ')
        .map { it.toInt() }
    val commonElements: Set<Int> = randomList.intersect(userList)
    println(commonElements)
    when (commonElements.size) {
        0 -> println("The user did not guess a single number.")
        1 -> println("A consolation prize is paid to the user.")
        2 -> println("The user guessed two numbers and won a large prize.")
        3 -> println("The user matched all the numbers and won the jackpot.")
    }
    println("Winning numbers $randomList")
}