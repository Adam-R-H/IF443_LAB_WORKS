package oop_00000133876_AdamRifqyHajat.week03

fun main() {
   val Senjata = Weapon("Budi")
    Senjata.damage = -50
    Senjata.damage = 9999
    println("Tier: ${Senjata.tier}")

    val Pemain = Player(username = "Pedang")
    Pemain.addXp(50)
    Pemain.addXp(60)
}