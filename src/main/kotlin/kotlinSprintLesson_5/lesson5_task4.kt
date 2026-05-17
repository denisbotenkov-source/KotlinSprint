package org.exampleter.kotlinSprintLesson_5

fun main() {
    val userName = "Zaphod"
    val password = "PanGalactic"
    println("Введите своё имя и пароль.")
    val user = readln().lowercase()
    val userPassword = readln().lowercase()
    if (user == userName.lowercase() && userPassword == password.lowercase()) {
        println(
            "Ваши данные проверены, и о, чудо, они верны... " +
                    "Пользователь \"$user\", вам разрешено входить на борт корабля \"Heart of Gold\". " +
                    "Хотя мне всё равно... Ну вперед, войдите... Если вам так уж надо, в конце концов... Меланхолический вздох. " +
                    "Надеюсь, вам понравится пребывание здесь больше, чем мне."
        )
    } else {
        println("Пройдите регистрацию.")
    }

}