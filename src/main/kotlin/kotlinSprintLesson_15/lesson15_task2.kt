package org.exampleter.kotlinSprintLesson_15

fun main() {
    val temperature = Temperature(20.0)
    val amount = PrecipitationAmount(5)
    val server = WeatherServer()
    server.SendingMessage(temperature)
    server.SendingMessage(amount)
}