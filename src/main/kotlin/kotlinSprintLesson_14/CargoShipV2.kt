package org.exampleter.kotlinSprintLesson_14

class CargoShipV2(
    override val speed: Int = 60,
    override val loadCapacity: Int = 8000,
    override val capacity: Int = 2500,
    override val loadingMethod: String = "Активирует погрузочный кран.",
) : LinerV2() {
    override fun printInfo(){
        println(loadingMethod)
    }
}