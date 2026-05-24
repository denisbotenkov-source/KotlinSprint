package org.exampleter.kotlinSprintLesson_6

fun main() {
    println("Придумайте логин.")
    val login = readln()
    println("Придумайте пароль.")
    val password = readln()
    do {
        println("Введите логин")
        val userLogin = readln()
        println("Введите пароль:")
        val userPassword = readln()
    } while (userPassword != password || userLogin != login)
    println("Авторизация прошла успешно.")
}