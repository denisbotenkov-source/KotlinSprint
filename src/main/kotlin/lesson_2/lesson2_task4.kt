package org.exampleter.lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buff = 20
    val transformation = buff / PERCENTAQES
    val baffCrystalOre = crystalOre * transformation
    val baffIronOre = ironOre * transformation
    println(" + ${baffCrystalOre.toInt()} to the crystalline ore.")
    println(" + ${baffIronOre.toInt()} to iron ore.")
}
const val PERCENTAQES = 100.0
