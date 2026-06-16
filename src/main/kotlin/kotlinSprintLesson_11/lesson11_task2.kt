package org.exampleter.kotlinSprintLesson_11

fun main() {
    val user = User2(1, "denkov", "admin", "denkov@mail.ru")
    user.readBio()
    user.changePassword()
    user.displayInfo()
}

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String? = null
) {
    fun displayInfo() = println("$id, $login, $password, $email, ${bio ?: ""}")

    fun readBio(): String? {
        println("О себе:")
        bio = readln()
        return bio

    }

    fun changePassword() {
        println("Введите текущий пароль")
        val currentPassword = readln()
        if (currentPassword == password) {
            println("Введите новый пароль.")
            password = readln()
            println("Пароль изменён.")
        } else {
            println("Неверный пароль.")
        }
    }
}