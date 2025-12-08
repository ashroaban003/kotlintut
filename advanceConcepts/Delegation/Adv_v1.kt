import kotlin.properties.Delegates
//read only
//lazy is example of it it happens first time it ws red
val expensiveComputaion: String by lazy {
    println("Intializing expensive computaion.. occurs only first")
    "The result of the calculation"
}
//write only, happens when written
var name: String by Delegates.observable("Initial Name") { 
    prop, old, new -> 
    println("Property ${prop.name} changed from '$old' to '$new'")
}
fun main(){
    println(expensiveComputaion)
    println(expensiveComputaion)
    name = "mana"
    name = "shreya"
}