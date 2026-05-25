package org.example.kotlinSprintLesson_6

fun main() {
    var attempts = 3
    while (attempts != 0) {
        val numFirst = (1..9).random()
        val numSecond = (1..9).random()
        val example = numFirst + numSecond
        println(
            "Докажите что вы не бот, решите пример: $numFirst + $numSecond " +
                    "Осталось попыток $attempts."
        )
        val user = readln().toIntOrNull()
        if (user == example) {
            println("Добро пожаловать!")
            break
        } else {
            attempts--
            println("Неверно. Осталось попыток $attempts")

        }
    }
    if (attempts == 0) {
        println("Доступ запрещен.")
    }
}