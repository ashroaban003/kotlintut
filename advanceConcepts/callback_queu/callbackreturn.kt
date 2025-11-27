fun processData(data: List<Int>, mul: (Int)->Int): List<Int> {
    val results = mutableListOf<Int>()
    for(i in data){
        val num = mul(i);
        results.add(num)
    }
    return results;
}

fun main(){
    val stringList = listOf(3,2,4)
    val ans = processData(stringList){number -> 
            number*2
       
    }
    println(ans)
   
}