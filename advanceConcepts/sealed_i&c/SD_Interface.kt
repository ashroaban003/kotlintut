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

fun main(){
    val state1 : life = Daisy(6)
    render(state1)
}