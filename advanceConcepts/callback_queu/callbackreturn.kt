fun processData(data: List<Int>, mul: (Int)->Int): List<Int> {
    val results = mutableListOf<Int>()
    for(i in data){
        val num = mul(i);
        results.add(num)
    }
    return results;
}
fun multicall(mana : (Int) -> Unit, shreya : ()-> Unit){
    mana(30)
    shreya()
}

fun main(){
    val stringList = listOf(3,2,4)
    //lamda callback function 
    val lamda = processData(stringList){number -> 
           val mul = 6
           number*mul //last element is returned
       
    }
    println(lamda)
    val mulcall = multicall(
        mana = {num ->
            println("happy birthday at nov ${num}")
        },
        shreya = {
            println("always in my heart")
        }
    )
   
}