package org.exampleter.lesson_5

fun main() {
    println("Enter your height (in cm) and weight (in kg).")
    val userHeightCm = readln().toDouble()
    val userWeight = readln().toDouble()
    val calculation = userHeightCm / 100
    val bmi = userWeight / (calculation * calculation)
    println("Your body mass index: %.2f".format(bmi))
    if (bmi < 18.5) {
        println("Insufficient body weight.")
    } else if (bmi < 25.0) {
        println("Normal body weight.")
    } else if (bmi < 30.0) {
        println("Excess body weight.")
    } else {
        println("Fatness.")
    }
}
