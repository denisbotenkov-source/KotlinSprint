package org.example.kotlinSprintLesson_5

const val USER_NAME = "Zaphod"
const val PASSWORD = "PanGalactic"

fun main() {
    println("Введите своё имя .")
    val user = readln().lowercase()
    if (user == USER_NAME.lowercase()) {
        println("Введите пароль")
    } else println("Пользователь не зарегистрирован.")
    val userPassword = readln().lowercase()
    if (userPassword == PASSWORD.lowercase()) {
        println(
            "Ваши данные проверены, и о, чудо, они верны... " +
                    "Пользователь \"Zaphod\", вам разрешено входить на борт корабля \"Heart of Gold\". " +
                    "Хотя мне всё равно... Ну вперед, войдите... Если вам так уж надо, в конце концов... Меланхолический вздох." +
                    " Надеюсь, вам понравится пребывание здесь больше, чем мне."
        )
    } else {
        println("Неверный пароль.")
    }
}


