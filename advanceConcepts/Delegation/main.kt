interface Repository{
    fun fetchData(): String
     fun save(data: String)
}
class dbrepo : Repository{
    override fun save(data: String){
        println("nah, I win ${data}")
    }
    override fun fetchData():String{
        return "ha ha";
    }
}
//by using by we can avoid boilerplate code and avoid implementing again and again the interface

class db2(private val db1:dbrepo) : Repository by db1{
    override fun save(data:String){
        println("your blessed, chosen one")
        db1.save("ashish")
    }
}

fun main(){
    val db1 = dbrepo()
    val cache = db2(db1)
    cache.save("mana")
}