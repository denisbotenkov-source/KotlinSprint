package org.exampleter.kotlinSprintLesson_10

fun main() {
    val resultBot = throwTheDice()
    val resultHuman = throwTheDice()
    println("Кубик бросает человек $resultHuman ")
    println("Кубик бросает робот $resultBot")
    if ( resultHuman > resultBot) {
        println("Победило человечество")
    } else if (resultBot >  resultHuman) {
        println("Победила машина")
    } else {
        println("Победила дружба")
    }


}

fun throwTheDice(): Int {
    val fling = (1..6).random()
    return fling
}