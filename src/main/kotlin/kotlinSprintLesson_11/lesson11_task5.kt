package org.example.kotlinSprintLesson_11

fun main() {
    val forum = Forum()
    forum.createNewUser("Анна")
    forum.createNewMessage(1, "Всем привет!")
    forum.createNewUser("Борис")
    forum.createNewMessage(2, "Как дела?")
    forum.createNewMessage(1, "Рад всех видеть!")
    forum.createNewMessage(2, "Всё отлично, спасибо!")
    forum.printThread()
}

class Forum {
    private val members: MutableList<ForumMember> = mutableListOf()
    private val messages: MutableList<ForumMessage> = mutableListOf()
    private var nextId = 1


    fun createNewUser(userName: String): ForumMember {
        val newMember = ForumMember(nextId, userName)
        members.add(newMember)
        nextId++
        return newMember
    }

    fun createNewMessage(authorId: Int, message: String): ForumMessage? {
        val user = members.find { it.userId == authorId }
        if (user != null) {
            val newMessage = ForumMessage(authorId, message)
            messages.add(newMessage)
            return newMessage
        }
        return null
    }

    fun printThread() {
        for (msg in messages) {
            val author = members.find { it.userId == msg.authorId }
            val userName = author?.userName ?: "Неизвестный"
            println("$userName: ${msg.message}")
        }
    }

    class ForumMember(
        val userId: Int,
        val userName: String,
    )

    class ForumMessage(
        val authorId: Int,
        val message: String,
    )
}