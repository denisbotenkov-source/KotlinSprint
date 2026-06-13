package org.exampleter

fun main() {
    val user1 = User(id = 1, login = "admin", password = "admin1", email = "denKov@mail.ru")
    val user2 = User(id = 2, login = "adminka", password = "adminka2", email = "kovDen@mail.ru")
    println("Id: ${user1.id},Login: ${user1.login},Password: ${user1.password},email: ${user1.email}")
    println("Id: ${user2.id},Login: ${user2.login},Password: ${user2.password},email: ${user2.email}")
}