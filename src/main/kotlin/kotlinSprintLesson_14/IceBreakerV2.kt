package org.exampleter.kotlinSprintLesson_14

class IceBreakerV2(
    private val kolotLed: Boolean = true,
    override val speed: Int = 50,
    override val loadCapacity: Int = 4000,
    override val capacity: Int = 800,
    override val loadingMethod: String = "Открывает ворота со стороны кормы.",
) : LinerV2() {
    override fun printInfo() {
        println(loadingMethod)
    }
}