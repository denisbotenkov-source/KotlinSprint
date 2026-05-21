package org.exampleter.kotlinSprintLesson_6

fun main() {
    val login = "denisDev"
    val password = "denis2222"
    println("Введите логин и пароль.")
    var userLogin = readln()
    var userPassword = readln()
    while (userPassword != password || login != userLogin) {
        println("Не правильный логин или пароль.")
        userLogin = readln()
        userPassword = readln()
    }
    println("Авторизация прошла успешно.")
}