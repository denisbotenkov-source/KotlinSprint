package org.exampleter.kotlinSprintLesson_15

interface CargoTransportation {
    val maxCargo: Int
    var currentCargo: Int
    var totalCargoTransported: Int

    fun loadCargo()
    fun unloadCargo()
}