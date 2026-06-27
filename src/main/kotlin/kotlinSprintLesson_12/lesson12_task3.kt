package org.exampleter.kotlinSprintLesson_12

const val CELSIUM_ED = 273

fun main() {
    val converter = WeatherV2(300, 310, 320)
    converter.print()
}

class WeatherV2(kelvin: Int, var dayTemperature: Int, var nightTemperature: Int) {
    val celsius = kelvin - CELSIUM_ED
    val dayTemp = dayTemperature - CELSIUM_ED
    val nightTemp = nightTemperature - CELSIUM_ED

    fun print() {
        println("$celsius, $dayTemp, $nightTemp")
    }
}
