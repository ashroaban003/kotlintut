typealias Callback = (Int, String, Boolean) -> Unit

fun process(handler: Callback) {
    println("Starting the process...")
    val code = 200
    val message = "Success"
    val status = true

    // Call the handler function with the required arguments
    handler(code, message, status)

    println("Process finished.")
}

// Example of calling the 'process' function with a lambda
fun main() {
    process { number, text, isActive ->
        println("--- Handler Executed ---")
        println("Received Number: $number")
        println("Received Text: $text")
        println("Received Status: $isActive")
        // The lambda implicitly returns Unit
    }
}
// Output:
// Starting the process...
// --- Handler Executed ---
// Received Number: 200
// Received Text: Success
// Received Status: true
// Process finished.