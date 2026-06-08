package kotlinSprintLesson_10

fun main() {
    println("Введите длину пароля.")
    val passwordLength = readln().toIntOrNull()
    val password = generatePassword(passwordLength)
    println(password)
}

fun generatePassword(passwordLength: Int?): String {
    val numbers = 0..9
    val symbols = ' '..'/'
    var password = ""
    if (passwordLength != null) {
        for (i in 0 until passwordLength) {
            if (i % 2 == 1) {
                password += symbols.random()
            } else {
                password += numbers.random()
            }
        }
    }
    return password
}