package oop_00000133876_AdamRifqyHajat.week06

// Fungsi ini Decoupled! Tidak peduli kelas aslinya apa.
fun processCheckout(method: PaymentMethod, amount: Double){
    println("-> Memulai checkout...")
    method.pay(amount) // Dynamic polymorphism in action
}

fun main() {
   val lamp1 = SmartLamp("RuangTamu", "1")
    val speaker1 = SmartSpeaker("Google Nest Dapur", "2")
    val CCTV1 = SmartCCTV("Ezviz Garasi", "3")
}