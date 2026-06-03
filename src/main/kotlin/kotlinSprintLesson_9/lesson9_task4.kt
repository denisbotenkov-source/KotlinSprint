package kotlinSprintLesson_9

fun main() {
    println("Введите 5 ингредиентов.")
    val user = readln().split(", ")
    println(user.sorted())
}