package kotlinSprintLesson_10

fun main() {
    println("Введите длину пароля.")
    val user = readln().toIntOrNull()
    val password = generatePassword(user)
    println(password)
}

fun generatePassword(passwordLength: Int?): String {
    val numbers = 0..9
    val symbols = """!"#$%&'()*+,-./ """
    var password = ""
    if (passwordLength != null)
        for (i in 0 until passwordLength) {
            if (i % 2 == 0) {
                password += symbols.random().toString()
            } else {
                password += numbers.random()
            }
        }
    return password
}