package org.example.kotlinSprintLesson_10

fun main() {
    println("Введите логин.")
    val loginUser = readln()
    println("Введите пароль.")
    val passwordUser = readln()

    if (isValidLogin(loginUser, passwordUser)) {
        println("Логин или пароль недостаточно длинные")
    } else {
        println("Добро пожаловать.")
    }
}

fun isValidLogin(login: String, password: String): Boolean {
    return login.length < 4 || password.length < 4

}
