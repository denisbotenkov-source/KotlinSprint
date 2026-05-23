package org.exampleter.kotlinSprintLesson_6

fun main() {
    println("Пройдите регистрацию.")
    var login = readln()
    var password = readln()
    lateinit var userLogin: String
    lateinit var userPassword: String
    do {
        println("Введите логин")
        userLogin = readln()
        println("Введите пароль:")
        userPassword = readln()
    } while (userPassword != password && userLogin != login)
    println("Авторизация прошла успешно.")
}