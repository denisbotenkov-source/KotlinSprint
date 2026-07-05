package org.exampleter.kotlinSprintLesson_15

class Admin(name: String) : ForumMember(name), AdminActions {
    override fun deleteMessage() {
        println("Администратор $name удалил сообщение.")
    }

    override fun deleteUser() {
        println("Администратор $name удалил пользователя.")
    }
}