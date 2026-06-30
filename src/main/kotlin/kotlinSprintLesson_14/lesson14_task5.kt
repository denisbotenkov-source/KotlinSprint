package org.exampleter.kotlinSprintLesson_14

fun main() {
    val discordChat = Chat()

    discordChat.addMessage("Иван", "Кто пойдет сегодня в футбол играть?")
    discordChat.addMessage("Артем", "Посоветуйте хороший фильм на вечер.")
    discordChat.addThreadMessage("Алексей", "Я пойду!", 1)
    discordChat.addThreadMessage("Сергей", "И я подтянусь к 19:00", 1)
    discordChat.addThreadMessage("Мария", "Посмотри фильм 'Начало' с Ди Каприо", 2)
    discordChat.printChat()
}