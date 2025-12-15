class Logger{
    fun log() = println("nah! I win")
}
class Database {
    fun save(data: String) = println("Saved: $data")
}
//our service
class UserService1(private val logger : Logger){
    fun createUser(){
        logger.log()
    }
}
context(Logger, Database)
fun createUser(name: String) {
    log()   // Logger available
    save(name)                   // Database available
}
fun main(){
    val logger = Logger()
    val database = Database()
    val userService1 = UserService1(logger)
    userService1.createUser()
   //context receiver
   with(logger){
    with(database){
        createUser("Shreya")
    }
   }

}