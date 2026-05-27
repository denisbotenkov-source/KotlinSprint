package kotlinSprintLesson_8

fun main() {
    val ingridients =
        arrayOf("Свёкла", "Капуста", "Морковь", "Лук", "Картофель", "Мясо", "Томат").map { it.lowercase() }
            .toTypedArray()
    println(ingridients.joinToString())
    println("Какой ингредиент хотите заменить?")
    val user = readln().lowercase()
    val check = ingridients.indexOf(user)
    if (check != -1) {
        println("На какой ингредиент хотите заменить?")
        val newList = readln().lowercase()
        ingridients[check] = newList
        println("Готово! Вы сохранили следующий список: ${ingridients.joinToString()}")
    } else {
        println("Такого ингредиента нет в списке.")
    }
}
