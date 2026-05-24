package org.exampleter.kotlinSprintLesson_7

import kotlin.random.Random

fun main() {
    val toGenerated = "abcdefghijklmnopqrstuvwxyz0123456789"
    var password = ""
    for (i in 1..6) {
        password += toGenerated[Random.nextInt(toGenerated.length)]
    }
    println(password)
}