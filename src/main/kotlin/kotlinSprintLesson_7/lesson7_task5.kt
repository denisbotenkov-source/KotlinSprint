package kotlinSprintLesson_7

const val MIN_CHARACTERS = 6
fun main() {
    val digits = '0'..'9'
    val lowercase = 'a'..'z'
    val uppercase = 'A'..'Z'
    var password = ""
    val allChars = digits + lowercase + uppercase
    println("Введите длину пароля.")
    val userPassword = readln().toIntOrNull()
    if (userPassword != null && userPassword >= MIN_CHARACTERS) {
        for (i in 0 until userPassword) {
            password += allChars.random()
        }
        password = password.toList().shuffled().joinToString("")
    } else {
        println("Минимальная длина пароля $MIN_CHARACTERS.")
    }
    println(password)
}