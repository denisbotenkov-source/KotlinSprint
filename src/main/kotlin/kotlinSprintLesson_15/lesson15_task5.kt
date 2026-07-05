package org.exampleter.kotlinSprintLesson_15

fun main() {
    val passengerCar = PassengerCar()
    val truck = Truck()
    passengerCar.loadPassenger()
    passengerCar.movementAuto()
    passengerCar.unloadPassenger()
    passengerCar.loadPassenger()
    passengerCar.movementAuto()
    passengerCar.unloadPassenger()
    truck.loadCargo()
    truck.movementAuto()
    truck.unloadCargo()
}