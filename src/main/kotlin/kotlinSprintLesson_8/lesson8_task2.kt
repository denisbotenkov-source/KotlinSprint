package kotlinSprintLesson_8

fun main() {
    val ingredients = arrayOf("Свёкла", "Капуста", "Морковь", "Лук", "Картофель", "Мясо", "Томат")
    println("Введите название ингредиента.")
    val searchIngredient = readln()

    for (i in ingredients) {
        if (searchIngredient == i) {
            println("Ингредиент $i в рецепте есть.")
            return
        }
    }

    println("Такого ингредиента в рецепте нет.")
}