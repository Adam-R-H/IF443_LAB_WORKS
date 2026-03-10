package oop_00000133876_AdamRifqyHajat.week03

class Weapon(val name: String) {
    var damage: Int = 0
        set(value){
            if (value < 0){
                println("ERROR: Damage tidak boleh negatif! Di-set ke 0.")
                field = 0
            } else if ( value > 1000){
                field = 1000
            } else {
                field = value
            }
        }
    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}