package kotlinSprintLesson_8

fun main() {
    val ingredients =
        arrayOf("Свёкла", "Капуста", "Морковь", "Лук", "Картофель", "Мясо", "Томат").map { it.lowercase() }
            .toTypedArray()
    println(ingredients.joinToString())
    println("Какой ингредиент хотите заменить?")
    val user = readln().lowercase()
    val check = ingredients.indexOf(user)
    if (check >= 0) {
        println("На какой ингредиент хотите заменить?")
        val newIngredient = readln().lowercase()
        ingredients[check] = newIngredient
        println("Готово! Вы сохранили следующий список: ${ingredients.joinToString()}")
    } else {
        println("Такого ингредиента нет в списке.")
    }
}
