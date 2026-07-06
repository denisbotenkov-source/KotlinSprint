package org.exampleter.kotlinSprintLesson_15

abstract class ForumMember(val name: String) {
    fun read() {
        println("$name читает форум.")
    }
    fun writeMessage() {
        println("$name печатает сообщение.")
    }
}