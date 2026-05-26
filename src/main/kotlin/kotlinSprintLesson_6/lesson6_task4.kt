package kotlinSprintLesson_6


fun main() {
    val secretNumber = (1..9).random()
    var attempts = 5
    while (attempts != 0) {
        println("Угадайте число от 1 до 9. Количество попыток $attempts")
        val user = readln().toIntOrNull()
        if (user == secretNumber && user != null) {
            println("Это была великолепная игра!")
            break
        } else {
            attempts--
            println("Неверно. Осталось попыток $attempts")
        }
    }
    println("Было загадано число $secretNumber")
}