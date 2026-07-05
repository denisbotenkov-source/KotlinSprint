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

    override fun loadPassenger() {

        if (currentPassengers + 3 <= maxPassengers) {
            currentPassengers += 3
            println("В авто загружено $currentPassengers пассажиров.")
        } else {
            println("Мест нет.")
        }
    }

    override fun unloadPassenger() {
        if (currentPassengers > 0) {
            currentPassengers -= 3
            println("Пассажиры выгрузились,осталось $currentPassengers.")
            totalPassengersTransported += 3
            println("Всего перевезено пассажиров: $totalPassengersTransported.")
        } else {
            println("В машине никого нет.")
        }
    }
}

