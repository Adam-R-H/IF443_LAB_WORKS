package oop_00000133876_AdamRifqyHajat.week05

import kotlin.system.exitProcess

fun main() {
   val Dompet = EWallet("Budi", 50000.0)
    val Kartu = CreditCard("Siti", 100000.0)

    val daftar : List<PaymentMethod> = listOf(Dompet, Kartu)

    for (payment in daftar){
        when (payment){
            is EWallet -> {
                payment.topUp(50000.0)
                payment.processPayment(75000.0)
            }
            is CreditCard -> {
                payment.processPayment(75000.0)
            }
        }
    }
}