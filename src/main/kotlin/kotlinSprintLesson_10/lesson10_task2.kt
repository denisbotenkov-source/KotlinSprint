package org.example.kotlinSprintLesson_10

const val MIN_LENGTH_DATA = 4
fun main() {
    println("Введите логин.")
    val loginUser = readln()
    println("Введите пароль.")
    val passwordUser = readln()

    if (isValidLogin(loginUser, passwordUser)) {
        println("Добро пожаловать.")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}

fun isValidLogin(login: String, password: String): Boolean {
    return login.length >= MIN_LENGTH_DATA && password.length >= MIN_LENGTH_DATA

}
