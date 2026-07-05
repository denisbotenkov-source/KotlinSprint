package org.exampleter.kotlinSprintLesson_15

class Duck() : Swimming, Flight {
    override fun fly() {
        println("Утка летит.")
    }

    override fun swim() {
        println("Утка плывёт.")
    }
}