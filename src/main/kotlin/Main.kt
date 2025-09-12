package org.exampleter

fun main() {
    val SECONDS_IN_HOUR = 3600
    val SECONDS_IN_MINUTE = 60
    val secondsInSpace = 6480
    val hours = secondsInSpace / SECONDS_IN_HOUR
    val remainingSecondsAfterHours = secondsInSpace % SECONDS_IN_HOUR
    val minutes = remainingSecondsAfterHours / SECONDS_IN_MINUTE
    val seconds = remainingSecondsAfterHours % SECONDS_IN_MINUTE

    println("[${String.format("%02d:%02d:%02d", hours, minutes, seconds)}]")
}



