package org.exampleter.kotlinSprintLesson_13

fun main() {
    val contact = ContactUser("Ростислав", 89123456789, "Reddit")
    contact.printInform()
}

class ContactUser(
    val name: String,
    val phoneNumber: Long,
    val companyName: String? = null
) {
    fun printInform() {
        println("Имя: $name \n Номер: $phoneNumber \n Компания: ${companyName ?: "<Не указано>"}")
    }
}