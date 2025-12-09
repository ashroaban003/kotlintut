//sealed interface can only be implemented in same file 
//so class Daisy,shreya and mana are the only availables

sealed interface life

data class Daisy(val age : Int) :life
data class Shreya(val data : String) :life
data class Mana(val data : String) :life

fun render(state : life){
    when(state){
        is Daisy -> println("always in my heart daisy age ${state.age}")
        is Shreya -> println(state.data)
        is Mana -> println("your are my ${state.data}")
    }
    //main advantage is there nwont be need of else block
    //bcs we know that there wont be any other type that can inherit it in some other file
}

//real life example of where it is used in backend for api
sealed interface ApiResponse

data class Ok(val body: String) : ApiResponse
data class NotFound(val url: String) : ApiResponse
object Unauthorized : ApiResponse

fun handleResponse(res: ApiResponse) {
    when (res) {
        is Ok -> println("Success: ${res.body}")
        is NotFound -> println("404 Not Found: ${res.url}")
        Unauthorized -> println("401 Unauthorized")
    }
}


fun main(){
    val state1 : life = Daisy(6)
    render(state1)

    //real world example
    val r1: ApiResponse = Ok("User list")
    val r2: ApiResponse = NotFound("/api/users/5")
    val r3: ApiResponse = Unauthorized

    handleResponse(r1)
    handleResponse(r2)
    handleResponse(r3)
}