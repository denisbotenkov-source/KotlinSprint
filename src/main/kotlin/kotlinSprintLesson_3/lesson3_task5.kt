package org.exampleter.kotlinSprintLesson_3

fun main() {
    val string = "D2-D4;0"
    val result = string.split("-", ";")
    val from = result[0]
    val to = result[1]
    val strokeNumber = result[2]
    println("Откуда:$from.")
    println("куда $to .")
    println("Номер хода:$strokeNumber.")
}