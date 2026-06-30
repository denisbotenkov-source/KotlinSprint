package org.exampleter.kotlinSprintLesson_14

class ChildMessage(id: Int, text: String, author: String,  val parentMessageId: Int ) : Message(id, text, author) {
}