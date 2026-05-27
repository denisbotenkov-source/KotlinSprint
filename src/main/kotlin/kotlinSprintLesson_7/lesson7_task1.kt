package kotlinSprintLesson_7

const val PASSWORD_SIZE = 6
fun main() {
    val numbers = 0..9
    val letters = ('a'..'z')
    var password = ""
    for (i in 1..PASSWORD_SIZE) {
        if (i % 2 == 0) {
            password += numbers.random()
        } else {
            password += letters.random()
        }
    }
    println(password)
}