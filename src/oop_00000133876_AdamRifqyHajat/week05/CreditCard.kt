package oop_00000133876_AdamRifqyHajat.week05

class CreditCard(name: String, val limit: Double, var usedAmount: Double = 0.0) : PaymentMethod(name) {
    override fun processPayment(amount: Double) {
        if (usedAmount + amount < limit) {
            usedAmount += amount
            print("sukses")
        }else{
            print("transasksi ditolak")
        }
    }
}
