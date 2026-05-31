package kotlinSprintLesson_9

fun main() {
    val ingredients = mutableListOf<String>("Капуста", "Укроп", "Картошка")
    println("В рецепте есть базовые ингредиенты: ${ingredients}")
    println("Желаете добавить ещё?")
    val userAnswer = readln()
    if (userAnswer.equals("да", true)) println("Какой ингредиент вы хотите добавить?")
    else return
    val newIngredient = readln()
    ingredients.add(newIngredient)
    println("Теперь в рецепте есть следующие ингредиенты: ${ingredients}")
}