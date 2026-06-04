package kotlinSprintLesson_7

const val MIN_CHARACTERS = 6
fun main() {
    val digits = '0'..'9'
    val lowercase = 'a'..'z'
    val uppercase = 'A'..'Z'
    val allChars = digits + lowercase + uppercase
    var password = ""

    println("Введите длину пароля.")
    val userPassword = readln().toIntOrNull()
    if (userPassword != null && userPassword >= MIN_CHARACTERS) {
        password += digits.random()
        password += lowercase.random()
        password += uppercase.random()
        for (i in 3 until userPassword) {
            password += allChars.random()
        }
    } else {
        println("Минимальная длина пароля $MIN_CHARACTERS.")
    }
    password = password.toList().shuffled().joinToString("")
    println(password)
}
