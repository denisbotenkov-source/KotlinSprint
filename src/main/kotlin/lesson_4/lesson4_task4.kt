package org.exampleter.lesson_4

fun main() {
    var hands = true
    var legs = false
    var back = false
    var press = true
    val correctDay = 2
   val isdayEven = correctDay % 2 == 0
   if (isdayEven){
       println(
           """
            Exercises for the hands:$hands" 
            Leg exercises:$legs 
            Exercise for the back:$back 
            Exercises for the press:$press
             """.trimMargin())
   }else{
       hands = !hands
       legs = !legs
       back = !back
       press = !press
   }
       }