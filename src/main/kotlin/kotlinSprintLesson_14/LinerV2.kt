package org.exampleter.kotlinSprintLesson_14

open class LinerV2(
    open val speed: Int = 80,
    open val loadCapacity: Int = 5000,
    open val capacity: Int = 1000,
    open val loadingMethod: String = "Выдвигает горизонтальный трап со шкафута.",
) {
    open fun printInfo() {
        println("Скорость: $speed, грузоподъёмность: $loadCapacity, вместимость: $capacity, Метод погрузки: $loadingMethod")
    }
}