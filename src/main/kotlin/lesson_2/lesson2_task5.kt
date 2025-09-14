package org.exampleter.lesson_2

import kotlin.math.pow


fun main() {
    val initialPayment = 70000.0
    val theInterestRate = 16.7 / 100
    val years = 20
    val theAmountOfTheDepositAfterTwentyYears = initialPayment * (1 + theInterestRate).pow(years)
    println(String.format("%.3f", theAmountOfTheDepositAfterTwentyYears))


}