package org.exampleter.kotlinSprintLesson_13

fun main() {
    val contact = Contact("Андрей", +79990003123, null)
}

class Contact(
    val name: String,
    val phoneNumber: Long,
    val companyName: String?,
)