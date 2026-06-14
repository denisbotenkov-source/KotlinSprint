package org.exampleter.kotlinSprintLesson_11

fun main() {
    val user = User2(1, "denkov", "admin", "denkov@mail.ru")
    user.schitvanieIzKonsoli()
    user.izmenenieParolya()
    user.infaUser()
}

class User2(
    var id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = ""
) {
    fun infaUser() = println("$id, $login, $password, $email, $bio")

    fun schitvanieIzKonsoli(): String {
        println("О себе:")
        bio = readln()
        return bio
    }

    fun izmenenieParolya() {
        println("Введите текущий пароль")
        val user = readln()
        if (user == password) {
            println("Введите новый пароль.")
            password = readln()
            println("Пароль изменён.")
        } else {
            println("Неверный пароль.")
        }
    }
}