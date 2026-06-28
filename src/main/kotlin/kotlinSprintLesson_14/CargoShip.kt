package org.exampleter.kotlinSprintLesson_14

class CargoShip(
    override val speed: Int = 60,
    override val loadCapacity: Int = 8000,
    override val capacity: Int = 2500,
) : Liner() {
}