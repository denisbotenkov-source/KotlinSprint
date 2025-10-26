package org.exampleter.lesson_5

const val REGISTERED_USER = "Zaphod"
const val REGISTERED_PASSWORD = "PanGalactic"
fun main() {
    val userZaphod = "Zaphod"
    val passvord = "PanGalactic"
    if (userZaphod == REGISTERED_USER && passvord == REGISTERED_PASSWORD) {
        println("Hello,Zaphod!")
    } else if (userZaphod == REGISTERED_USER && passvord != REGISTERED_PASSWORD) {
        println("Complete the registration process.")
    } else if (userZaphod != REGISTERED_USER) {
        println("There is no such name")
    }
}

