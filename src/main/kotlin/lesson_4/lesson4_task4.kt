package org.exampleter.lesson_4

fun main() {
    var hands = true
    var legs = false
    var back = false
    var press = true
    for (day in 1..31) {
        println(
            """
            Exercises for the hands:$hands" 
            Leg exercises:$legs 
            Exercise for the back:$back 
            Exercises for the press:$press
            Day${day}
             
             """.trimMargin())
        hands = !hands
        legs = !legs
        back = !back
        press = !press
    }
}