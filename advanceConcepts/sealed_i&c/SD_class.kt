sealed class PaymentResult

data class Success(val transactionId: String) : PaymentResult()
data class Failed(val reason: String) : PaymentResult()
object Pending : PaymentResult()

fun processResult(result: PaymentResult) {
    when (result) {
        is Success -> println("✅ Paid successfully: ${result.transactionId}")
        is Failed -> println("❌ Payment failed: ${result.reason}")
        Pending -> println("⏳ Payment is pending")
    }
}

fun main() {
    val r1: PaymentResult = Success("TXN123")
    val r2: PaymentResult = Failed("Insufficient balance")
    val r3: PaymentResult = Pending

    processResult(r1)
    processResult(r2)
    processResult(r3)
}
