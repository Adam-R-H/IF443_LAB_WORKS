package oop_00000133876_AdamRifqyHajat.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}