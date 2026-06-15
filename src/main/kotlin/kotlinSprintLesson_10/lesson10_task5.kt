package kotlinSprintLesson_10

const val ADMIN_LOGIN = "admin"
const val ADMIN_PASSWORD = "admin1"

fun main() {
    val inputLogin = "admin"
    val inputPassword = "admin1"
    val userToken = loginUser(inputLogin, inputPassword)

    if (userToken != null) {
        val cart = showCart(userToken)
        println(cart)
    } else {
        println("Ошибка авторизации.")
    }
}

fun generateToken(): String {
    val allowedChars = ('a'..'z') + ('0'..'9')
    return List(32) { allowedChars.random() }.joinToString("")
}

fun loginUser(login: String, password: String): String? {
    if (login == ADMIN_LOGIN && password == ADMIN_PASSWORD) {
        return generateToken()
    } else {
        return null
    }
}

fun showCart(token: String): List<String> {
    val cartItems = listOf("Носки", "Футболки", "Рубашки")
    return cartItems
}

