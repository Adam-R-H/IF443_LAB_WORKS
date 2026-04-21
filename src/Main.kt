package oop_00000133876_AdamRifqyHajat.week07

fun main() {
    GameManager.startGame()
    GameManager.startGame()

    println("Rarity legendary = ${ItemRarity.LEGENDARY.dropChance}%")
    val StarterSword = Weapon.forgeStarterSword()

    println("Membuat senjata dengan detail: ${StarterSword.item}")

    val UpgradedStarter = StarterSword.item.copy(damage = 25, name = "Pedang Kayu Bapuk (Upgraded)")
    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(UpgradedStarter))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}