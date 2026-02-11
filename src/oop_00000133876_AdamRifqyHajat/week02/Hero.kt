package oop_00000133876_AdamRifqyHajat.week02.oop_00000133876_AdamRifqyHajat.week02

class Hero (
    val name : String,
    var hp : Int = 100,
    val baseDamage : Int
) {
    fun attack(targetName: String) {
        print("$name menebas $targetName!")
    }
    fun takeDamage(damage: Int) {
        if (hp - damage < 0){
            hp = 0
        } else{
            hp -= damage
        }
    }
    fun isAlive() : Boolean{
        if (hp < 0){
            return false
        } else {
            return true
        }
    }
}