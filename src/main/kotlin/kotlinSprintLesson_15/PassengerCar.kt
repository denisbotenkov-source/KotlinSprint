package org.exampleter.kotlinSprintLesson_15

class PassengerCar() : Movement, PassengerTransportation {
    override var flight: Int = 1
    override val maxPassengers: Int = 3
    override var currentPassengers: Int = 0
    override var totalPassengersTransported: Int = 0


    override fun movementAuto() {
        println("Авто отправился в рейс номер $flight")
        flight++
    }

    override fun loadPassenger(amount: Int) {
        if (currentPassengers + amount <= maxPassengers) {
            currentPassengers += amount
            println("В авто загружено $currentPassengers пассажиров.")
        } else {
            println("Мест нет.")
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

