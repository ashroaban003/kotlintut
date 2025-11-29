interface callcenter{
    fun onProcess(process : Int)
    fun onSuccess(result : String)
    fun onFailure(error : String)
}
class mana(val nums : Int){
    fun printnum(){
        println("birthday tmrw ${nums}" )
    }
    // fun end()
}

open class keerthi(val nums :Int){
    open fun igUser(){
        println("she blocked ${nums}")
    }
}

abstract class shreya(){
    abstract fun finals()
}

fun executeTask(listener: callcenter,ender: mana,finisher: shreya,blocker:keerthi){
    println("task started")
    listener.onProcess(0)
    listener.onSuccess("hey")
    listener.onFailure("not failed")

    //class
    ender.printnum()
    finisher.finals()
    blocker.igUser()
}

fun main(){
    executeTask(object : callcenter {
        override fun onProcess(process: Int) {
            println("▶️ Progress: $process%")
        }

        override fun onSuccess(result: String) {
            println("✅ Success! Final Result: $result")
        }

        override fun onFailure(error: String) {
            println("❌ Failure! Error details: $error")
        }
    },mana(30)
    ,object : shreya(){
        override fun finals(){
            println("shreya")
        }
    },object: keerthi(6){
        override fun igUser(){
            println("she blocked ${nums*3}")
        }
    }
    )
}