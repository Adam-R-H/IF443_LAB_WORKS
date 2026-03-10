package oop_00000133876_AdamRifqyHajat.week05

class EWallet(name: String, var balance: Double) : PaymentMethod(name) {
    override fun processPayment(amount: Double) {
        if(balance >= amount) {
            balance -= amount
            println("sukses")
        }else{
            println("Saldo tidak cukup")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
    }
}