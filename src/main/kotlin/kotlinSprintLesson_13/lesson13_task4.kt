package org.exampleter.kotlinSprintLesson_13

fun main() {
    val contacts = mutableListOf<Contacts>()
    while (true) {
        println("Введите имя.")
        val userName = readln()
        println("Введите номер телефона.")
        val userPhoneNumber = readln().toLongOrNull() ?: null
        if (userPhoneNumber == null) {
            println("Номер телефона не указан или введён некорректно. Контакт не добавлен.")
            continue
        }
        println("Введите название компании.")
        val userCompanyName = readln().ifBlank { null }
        contacts.add(Contacts(userName, userPhoneNumber, userCompanyName))
        println("Добавить ещё? (да/нет)")
        if (readln().lowercase() != "да") break
    }
    for (contact in contacts) {
        contact.printInform()
    }
}

class Contacts(
    var name: String,
    var phoneNumber: Long?,
    var companyName: String?,
) {
    fun printInform() {
        println("Имя: $name \n Номер: $phoneNumber \n Компания: ${companyName ?: "<Не указано>"}")
    }
}



