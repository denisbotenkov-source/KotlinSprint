package kotlinSprintLesson_7

const val MIN_CHARACTERS = 6
fun main() {
    val digits = '0'..'9'
    val lowercase = 'a'..'z'
    val uppercase = 'A'..'Z'
    var password = ""
    println("Введите длину пароля.")
    val userPassword = readln().toIntOrNull()
    if (userPassword != null && userPassword >= MIN_CHARACTERS) {
        for (i in 0 until userPassword) {
            if (i % 3 == 0) {
                password += digits.random()
            } else if (i % 3 == 1) {
                password += lowercase.random()
            } else {
                password += uppercase.random()
            }
        }
        password = password.toList().shuffled().joinToString("")
    } else {
        println("Минимальная длина пароля $MIN_CHARACTERS.")
    }
    println(password)
}