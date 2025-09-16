package org.exampleter.lesson_3

fun main() {
    val string = "D2-D4:0"
    val parts = string.split("-", ":")
    val first = parts[0]
    val second = parts[1]
    val third = parts[2]
    println(first)
    println(second)
    println(third)
}
