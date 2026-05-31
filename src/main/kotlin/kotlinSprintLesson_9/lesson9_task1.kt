package kotlinSprintLesson_9

fun main() {
    val ingredients = listOf<String>("Баклажан", "Картошка", "Масло")
    println("В рецепте есть следующие ингредиенты: ${ingredients.joinToString(", ")}")
    ingredients.forEach { ingredient ->
        println(ingredient)
    }
}

