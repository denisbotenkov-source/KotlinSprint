package org.exampleter.kotlinSprintLesson_15

fun main() {
    val passengerCar = PassengerCar()
    val truck = Truck()
    passengerCar.loadPassenger(3)
    passengerCar.movementAuto()
    passengerCar.unloadPassenger(3)
    truck.loadCargo()
    truck.loadPassenger(1)
    truck.movementAuto()
    truck.unloadCargo()
    truck.unloadPassenger(1)
    passengerCar.loadPassenger(2)
    passengerCar.movementAuto()
    passengerCar.unloadPassenger(2)
}