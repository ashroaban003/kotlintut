class Logger{
    fun log() = println("nah! I win")
}
class UserService1(private val logger : Logger){
    fun createUser(){
        logger.log()
    }
}

fun main(){
    val logger = Logger()
}