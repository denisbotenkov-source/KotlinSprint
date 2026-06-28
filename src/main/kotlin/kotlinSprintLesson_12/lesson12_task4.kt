package org.exampleter.kotlinSprintLesson_12

const val CELSIUM_ED = 273
fun main() {
    val converter = WeatherV3(300, 310, 320, true)

}

class WeatherV3(kelvin: Int, dayTemperature: Int, nightTemperature: Int, hasPrecipitation: Boolean) {
    init {
        val celsius = kelvin - CELSIUM_ED
        val dayTemp = dayTemperature - CELSIUM_ED
        val nightTemp = nightTemperature - CELSIUM_ED
        println("$celsius, $dayTemp, $nightTemp, $hasPrecipitation")
    }
}