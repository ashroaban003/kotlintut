// import kotlin.contracts.*

data class User(val name: String)

fun isValidUser(user: User?): Boolean {
    // contract {
    //     returns(true) implies (user != null)
    // }
    return user != null && user.name.isNotBlank()
}

fun main() {
    val user: User? = User("Ashish")

    if (isValidUser(user)) {
        println(user.name)  // SAFE
    }
}
