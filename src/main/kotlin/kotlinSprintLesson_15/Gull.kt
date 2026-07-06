package org.exampleter.kotlinSprintLesson_15

class Gull() : Swimming, Flight {
    override fun fly() {
        println("Чайка летит.")
    }

    override fun swim() {
        println("Чайка плывёт.")
    }
}