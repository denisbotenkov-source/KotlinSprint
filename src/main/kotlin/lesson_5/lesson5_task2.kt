package org.exampleter.lesson_5
import java.time.LocalDate
fun main() {
    val currentYear = LocalDate.now().year
    println("Enter the year of birth:")
    val user = readln().toInt()
    val calculation = currentYear - user
    if (calculation > REQUIRED_YEAR_OF_BIRTH) {
        println("Age is not appropriate.")
    } else {
        println("Age is appropriate.")
    }
}

const val REQUIRED_YEAR_OF_BIRTH = 18
