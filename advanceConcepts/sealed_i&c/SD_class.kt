sealed class PaymentResult

data class Success(val transactionId: String) : PaymentResult()
data class Failed(val reason: String) : PaymentResult()
//data class Refunded(val amount: Int) : PaymentResult() , adding this gives compile time error, since all cases must be handled in where class
//sealed cases should all be handled
object Pending : PaymentResult()

fun processResult(result: PaymentResult) {
    when (result) { //when expression is always exhaustive for sealed class
        is Success -> println("✅ Paid successfully: ${result.transactionId}")
        is Failed -> println("❌ Payment failed: ${result.reason}")
        Pending -> println("⏳ Payment is pending")
    }
}

open class dummy
data class dm1(val id:Int) :dummy()
data class dm2(val id:Int) :dummy()
fun processDummy(result: dummy){
    when(result){
        is dm1 -> println("dump")  //it wont cause any error, since we are not returning anything so kotlin accepts the fact there can be multiple
    }
}
fun processDummy2(result: dummy): String {
    return when (result) {
        is dm1 -> "dm1"
        // ❌ compiler error: 'when' expression must be exhaustive , so all cases must be handled
        else -> "exhaustive when return "
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
