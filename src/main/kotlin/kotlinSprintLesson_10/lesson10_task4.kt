package kotlinSprintLesson_10

fun main() {
    var user = ""
    var round = 1
    var userWins = 0

    do {
        println("Раунд: $round.")
        if (playRound()) {
            userWins++
        }
        println("Хотите бросить кости еще раз? Введите Да или Нет.")
        user = readln()
        if (user.equals("Нет", ignoreCase = true)) {
            break
        } else {
            round++
        }
    } while (user != "Нет")
    println("Количество выйгранных партий: $userWins")

}

fun playRound(): Boolean {
    val human = rollDie()
    val bot = rollDie()
    println("Компьютер и человек по очереди бросают кости. Человек: $human. Компьютер: $bot")

    if (bot > human) {
        println("Победил компьютер.")
        return false
    } else if (bot < human) {
        println("Победило человечество.")
        return true
    } else {
        println("Ничья.")
        return false
    }

}

fun rollDie(sides: Int = 6): Int = (1..sides).random()



