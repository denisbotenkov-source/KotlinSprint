package org.exampleter.lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buff = 0.20
    val baffCrystalOre = crystalOre * buff
    val baffIronOre = ironOre * buff
    println(" + ${baffCrystalOre.toInt()} к кристаллической руде.")
    println(" + ${baffIronOre.toInt()} к железной руде.")
}