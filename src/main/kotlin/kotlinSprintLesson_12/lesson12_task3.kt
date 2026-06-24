package org.exampleter.kotlinSprintLesson_12

const val CELSIUM_ED = 273

fun main() {
    val converter = Converter(300)
    converter.print()
}

class Converter(kelvin: Int) {
    val celsius = kelvin - CELSIUM_ED

    fun print() {
        println("$celsius")
    }
}

//Я не понимаю для чего тут копировать класс с предыдущего урока, если там был вывод температуры в консоль. а здесь просто перевод из кельвинов в цельсии((