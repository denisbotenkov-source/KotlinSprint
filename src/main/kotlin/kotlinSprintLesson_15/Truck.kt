package org.exampleter.kotlinSprintLesson_15

class Truck : Movement, CargoTransportation {
    override val maxCargo: Int = 2
    override var flight: Int = 1
    override var currentCargo: Int = 0
    override var totalCargoTransported: Int = 0

    override fun loadCargo() {
        if (currentCargo < maxCargo) {
            currentCargo += 2
            println("В машину загрузили $currentCargo тонн груза.")
        } else {
            println("Машина загружена.")
        }
    }

    override fun unloadCargo() {
        if (currentCargo > 0) {
            currentCargo -= 2
            println("Из машины выгрузили $currentCargo груза.")
            totalCargoTransported += 2
            println("Всего перевезли груза $totalCargoTransported тонн.")
        } else {
            println("Машина пустая.")
        }
    }

    override fun movementAuto() {
        println("Машина отправилась в рейс номер $flight")
        flight++
    }

}