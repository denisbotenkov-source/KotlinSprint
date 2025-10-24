package org.exampleter.lesson_5

fun main() {
    println("Enter the travel distance (km), fuel consumption per 100 km (in liters), and the current price per liter of fuel.")
    val travelDistance: Double = readln().toDouble()
    val fuelConsumption: Double = readln().toDouble()
    val pricePerLiter: Double = readln().toDouble()
    val calculation = (travelDistance * fuelConsumption) / 100
    val fuelCost = pricePerLiter * calculation
    println("Total amount of fuel required: %.2f.".format(calculation))
    println("Total cost of the trip: %.2f.".format(fuelCost))

}