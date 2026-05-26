package kotlinSprintLesson_7

const val MIN_CHARACTERS = 6
fun main() {
    val digits = "0123456789"
    val lowercase = "abcdefghijklmnopqrstuvwxyz"
    val uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    var password = ""
    println("Введите длину пароля.")
    val userPassword = readln().toIntOrNull()
    if (userPassword != null && userPassword >= MIN_CHARACTERS) {
        for (i in 0..userPassword) {
            if (i % 3 == 0) {
                password += digits.random()
            } else if (i % 3 == 1) {
                password += lowercase.random()
            } else {
                password += uppercase.random()
            }
        }
    } else {
        println("Минимальная длина пароля $MIN_CHARACTERS.")
    }
    println(password)
}