package oop_00000133876_AdamRifqyHajat.week07

fun processEvent(event: BattleState){
    when (event){
        is BattleState.MonsterEncounter -> println("Sekarang melawan ${event.monsterName}")
        is BattleState.LootDropped -> println("Mendapatkan ${event.item.name} dengan rarity ${event.item.rarity}")
        is BattleState.GameOver -> println("Game Over!")
        is BattleState.SafeZone -> println("Anda di dalam zona aman!")
    }
}