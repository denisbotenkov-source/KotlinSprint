package org.exampleter.kotlinSprintLesson_6

fun main() {
    val secretNumber = 6
    var attempts = 5
    while (attempts != 0) {
        println("Угадайте число от 1 до 9.Количество попыток $attempts")
        val user = readln().toIntOrNull()
        if (user == secretNumber) {
            println("Это была великолепная игра!")
            break
        }
        if (user != secretNumber) {
            attempts--
            println("Неверно.Осталось попыток $attempts")
        }
        if (attempts == 0) {
            println("Было загадано чтсало $secretNumber")
            break
        }
    }
}