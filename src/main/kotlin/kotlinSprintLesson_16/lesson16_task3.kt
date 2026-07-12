package org.exampleter.kotlinSprintLesson_16

fun main() {
    val checkPassword = User("denis", "abc")
    println(checkPassword.check("abc"))
}