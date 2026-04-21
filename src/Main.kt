package oop_00000133876_AdamRifqyHajat.week07

fun main() {
    GameManager.startGame()
    GameManager.startGame()

    println("Rarity legendary = ${ItemRarity.LEGENDARY.dropChance}%")
    val StarterSword = Weapon.forgeStarterSword()

    println("Membuat senjata dengan detail: ${StarterSword.item}")
}