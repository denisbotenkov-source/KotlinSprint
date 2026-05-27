package kotlinSprintLesson_8

fun main() {
    val ingredients = arrayOf("Свёкла", "Капуста", "Морковь", "Лук", "Картофель", "Мясо", "Томат")
    println("Введите название ингридиента.")
    val user = readln()
    for (i in ingredients) {
        if (user == i) {
            println("Ингридиент $i в рецепте есть.")
            return
        }
    }
    println("Такого ингридиента в рецепте нет.")
}