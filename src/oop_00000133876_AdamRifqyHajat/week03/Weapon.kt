package oop_00000133876_AdamRifqyHajat.week03

class Weapon(val name: String) {
    var damage: Int = 6750
        set(value){
            if (value < 0){
                println("ERROR: Damage tidak boleh negatif! Di-set ke 0.")
                field = 0
            } else if ( value > 1000){
                field = 1000
            }
        }
    var tier: String = ""
        get(){
        if (damage > 800){
            return "Legendary"
        }
        else if (damage > 500){
            return "Epic"
        }
        else{
            return "Common"
        }
    }
}