package org.exampleter.kotlinSprintLesson_13

fun main() {
    println("Введите номер телефона.")
    val userNumber = readln()

    try {
        val user = userNumber.toLong()
        println("Номер: $user")
    } catch (e: Exception) {
        println(e::class.simpleName)
    }
}

class PhoneBook(
    var name: String,
    var phoneNumber: Long?,
    var companyName: String?,
)