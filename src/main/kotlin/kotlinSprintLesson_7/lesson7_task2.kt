package kotlinSprintLesson_7

fun main() {
    var code: Int
    var user: Int?
    do {
        code = (1000..9999).random()
        println("Ваш код авторизации: $code.")
        user = readln().toIntOrNull()
        if (user != null && user != code) {
            println("Неверный код, скоро прийдёт новый.")
        }
    } while (user == null || user != code)
    println("Добро пожаловать!")
}