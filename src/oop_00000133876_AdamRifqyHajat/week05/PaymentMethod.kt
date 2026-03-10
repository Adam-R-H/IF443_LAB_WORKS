package oop_00000133876_AdamRifqyHajat.week05

abstract class PaymentMethod(accountName: String) {
    abstract fun processPayment(amount: Double)
}