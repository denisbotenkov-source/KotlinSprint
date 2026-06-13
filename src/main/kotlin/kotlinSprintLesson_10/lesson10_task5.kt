package kotlinSprintLesson_10

const val ADMIN_LOGIN = "admin"
const val ADMIN_PASSWORD = "admin1"

fun main() {
    println("Введите логин.")
    val inputLogin = readln()

    println("Введите пароль.")
    val inputPassword = readln()

    val userToken = loginUser(inputLogin, inputPassword)

    if (userToken != null) {
        showCart(token = userToken)
    } else {
        println("Ошибка авторизации.")
    }
}

fun generateToken(): String {
    val allowedChars = ('a'..'z').toList() + ('0'..'9').toList()
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
    println("Доступ к корзине по токену: $token")
    println(cartItems)
    return cartItems
}

