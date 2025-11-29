Interface callcenter{
    fun onProcess(process : Int)
    fun onSuccess(result : String)
    fun OnFailure(error : String)
}

fun executeTask(listener: callcenter){
    println("task started")
    listener.onProcess()
    listener.onSuccess()
    listener.OnFailure()  
}

fun main(){
    executeTask(object : callcenter{
        override fun onProcess(progress: Int) {
            println("▶️ Progress: $progress%")
        }

        override fun onSuccess(result: String) {
            println("✅ Success! Final Result: $result")
        }

        override fun onFailure(error: String) {
            println("❌ Failure! Error details: $error")
        }
    })
}