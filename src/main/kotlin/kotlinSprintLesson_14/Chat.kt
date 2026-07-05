package org.exampleter.kotlinSprintLesson_14

class Chat {
    val groupMessage = mutableListOf<Message>()
    private var nextId = 1

    fun addMessage(author: String, text: String) {
        val newMessege = Message(nextId, author, text)
        groupMessage.add(newMessege)
        nextId++
    }

    fun addThreadMessage(author: String, text: String, parenMessageId: Int) {
        val addThreadMessage = ChildMessage(nextId, author, text, parenMessageId)
        groupMessage.add(addThreadMessage)
        nextId++
    }

    fun printChat() {
        val groupedChat = groupMessage.groupBy { message ->
            when (message) {
                is ChildMessage -> message.parentMessageId
                else -> message.id
            }
        }
        for ((groupId, messages) in groupedChat) {
            for (message in messages) {
                if (message is ChildMessage) {
                    print("\t")
                    println("${message.author}: ${message.text}")
                } else {
                    println("${message.author}: ${message.text}")
                }
            }
        }
    }
}