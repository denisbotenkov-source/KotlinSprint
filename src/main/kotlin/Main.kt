package org.exampleter

fun main() {
    val secondsInSpace = 6480
    val hours = secondsInSpace / 3600                  // 1 час = 3600 секунд
    val minutes = (secondsInSpace % 3600) / 60

    println("Часы: %02d".format(hours))
    println("Минуты: $minutes")

}


