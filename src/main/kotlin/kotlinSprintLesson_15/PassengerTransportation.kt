package org.exampleter.kotlinSprintLesson_15

interface PassengerTransportation {
    val maxPassengers: Int
    var currentPassengers: Int
    var totalPassengersTransported: Int

    fun loadPassenger()
    fun unloadPassenger()
}