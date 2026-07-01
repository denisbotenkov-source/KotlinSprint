package org.exampleter.kotlinSprintLesson_14

class IceBreaker(
    private val kolotLed: Boolean = true,
    override val speed: Int = 50,
    override val loadCapacity: Int = 4000,
    override val capacity: Int = 800,
) : Liner() {
}