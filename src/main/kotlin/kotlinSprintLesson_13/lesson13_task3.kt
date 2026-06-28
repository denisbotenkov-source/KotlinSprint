package org.exampleter.kotlinSprintLesson_13

fun main() {
    val contacts = listOf(
        ContactNumber("Имя1", 89123456789, "Компания"),
        ContactNumber("Имя2", 89123456780, null),
        ContactNumber("Имя3", 89123456781, "null"),
        ContactNumber("Имя4", 89123456782, null),
        ContactNumber("Имя5", 89123456783, "ДругаяКомпания")
    )
    println("${contacts.map { it.companyName }}")
}

class ContactNumber(
    val name: String,
    val phoneNumber: Long,
    val companyName: String? = null
)