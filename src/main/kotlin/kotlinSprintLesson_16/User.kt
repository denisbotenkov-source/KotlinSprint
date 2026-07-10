package org.exampleter.kotlinSprintLesson_16

class User(val login: String, private val password: String = "abc123") {
    fun check(userPassword: String): Boolean = password == userPassword
}