package oop_00000133876_AdamRifqyHajat.week05

fun main() {
   val Helper1 = MathHelper()
    println("Luas Square 10 = ${Helper1.hitungLuas(10)}\n" +
            "Luas Rectangle 10x20 = ${Helper1.hitungLuas(10, 20)}\n" +
            "Luas Circle 10 = ${Helper1.hitungLuas(10.toDouble())}")
}