package org.exampleter.kotlinSprintLesson_15

fun main() {
    val user = User("Никита")
    val admin = Admin("Максим")
    user.read()
    user.writeMessage()
    admin.read()
    admin.writeMessage()
    admin.deleteMessage()
    admin.deleteUser()
}