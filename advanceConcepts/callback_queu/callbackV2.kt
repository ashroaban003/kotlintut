interface callcenter{
    fun onProcess(process : Int)
    fun onSuccess(result : String)
    fun onFailure(error : String)
}

fun executeTask(listener: callcenter){
    println("task started")
    listener.onProcess(0)
    listener.onSuccess("hey")
    listener.onFailure("not failed")
}

fun main(){
    executeTask(object : callcenter {
        override fun onProcess(process: Int) {
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