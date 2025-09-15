package org.exampleter.lesson_3

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    println("Enter a number for the multiplication table:")
    val num = reader.nextInt()
    println("Enter the maximum number to multiply by:")
    val res = reader.nextInt()
    for (i in 1..res) {
        println(i * num)
    }


}