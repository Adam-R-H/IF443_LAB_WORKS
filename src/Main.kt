package oop_00000133876_AdamRifqyHajat.week04

fun main() {
   val Manajer = Manager("Budi", 5000000)
    val Pengembang = Developer("Bob", baseSalary = 2000000, "Kotlin")

    Manajer.work()
    println("Bonus ${Manajer.name} = ${Manajer.calculateBonus()}")

    Pengembang.work()
    println("Bonus ${Pengembang.name} = ${Pengembang.calculateBonus()}")
}