package org.exampleter.kotlinSprintLesson_16

class User(private val login: String, private val password: String) {
    fun check(userPassword: String): Boolean = password == userPassword
}