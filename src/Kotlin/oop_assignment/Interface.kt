package Kotlin.oop_assignment

import Kotlin.BankTransfer
import Kotlin.CreditCardPayment
import Kotlin.PayPalPayment
import Kotlin.PaymentMethod

fun main(){
    val credit = CreditCardPayment(cardNumber = "56574893973374", cardHolderName = "Wafaa Farahat",
        expiryDate = "06-26")
    val bank = BankTransfer(bankAccountNumber = "56575775775775", bankName = "CIB")
    val paypal = PayPalPayment(email = "a.pooo@gmail.com")

    credit.makePayment(x = credit, amount = 20.0)
    bank.makePayment(x = bank, amount = 30.0)
    paypal.makePayment(x = paypal, amount = 50.0)

}

interface PaymentMethod {
    fun processPayment(amount :Double):String
    fun getPaymentDetails(): String
    fun makePayment(x:PaymentMethod, amount: Double):Boolean{
        val success=x.processPayment(amount)
        println(x.getPaymentDetails())
        return success
    }
}
class CreditCardPayment (val cardNumber:String ,val cardHolderName:String,val expiryDate:String): PaymentMethod {
    override fun processPayment(amount: Double): Boolean {
        println("Processing payment of $amount using Credit Card")
        return true
    }
    override fun getPaymentDetails(): String {
        return "Card Number: $cardNumber, Holder: $cardHolderName, Expiry: $expiryDate"
    }
}

class PayPalPayment (val email:String): PaymentMethod {
    override fun processPayment(amount: Double): Boolean {
        println("Processing payment of $amount using Paypal")
        return true}
    override fun getPaymentDetails(): String {
        return "PayPal Email: $email"
    }
}

class BankTransfer (val bankAccountNumber:String, val bankName:String): PaymentMethod {
    override fun processPayment(amount: Double): Boolean {
        println("Processing payment of $amount using Bank Transfer Payment")
        return true
    }
    override fun getPaymentDetails(): String {
        return "Bank Account: $bankAccountNumber, Bank Name: $bankName"
    }
}