package org.exampleter.kotlinSprintLesson_7

import kotlin.random.Random

fun main() {
    do {
        val code = Random.nextInt(1000, 10000)
        println("Ваш код авторизации: $code.")
        val user = readln().toIntOrNull()
        if (user != code) {
            println("Неверный код,скоро прийдёт новый.")
            continue
        } else {
            println("Добро пожаловать!")
        }
    } while (user != code)
}