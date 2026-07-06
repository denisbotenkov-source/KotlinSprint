package org.exampleter.kotlinSprintLesson_15

class Truck : Movement, CargoTransportation, PassengerTransportation {
    override val maxCargo: Int = 2
    override var flight: Int = 1
    override var currentCargo: Int = 0
    override var totalCargoTransported: Int = 0
    override val maxPassengers: Int = 1
    override var currentPassengers: Int = 0
    override var totalPassengersTransported: Int = 0


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

    override fun loadPassenger(amount: Int) {
        if (currentPassengers + amount <= maxPassengers) {
            currentPassengers += amount
            println("Загружено пассажиров $currentPassengers.")
        }
    }

    override fun unloadPassenger(amount: Int) {
        if (currentPassengers >= amount) {
            currentPassengers -= amount
            println("Пассажиры выгрузились,осталось $currentPassengers.")
            totalPassengersTransported += amount
            println("Всего перевезено пассажиров: $totalPassengersTransported.")
        } else {
            println("Нельзя выгрузить $amount, в машине только $currentPassengers.")
        }
    }

}


