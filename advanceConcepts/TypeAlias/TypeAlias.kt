typealias callback = (Int , Int , Int) -> Int;

fun process(x : Int,mana : callback){
    println(mana(x,x+1,x+2));
}


fun main() {
    process(9){ a,b,c ->
        a+b+c
    }
}
