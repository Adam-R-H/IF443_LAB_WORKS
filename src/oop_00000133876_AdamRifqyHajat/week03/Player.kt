package oop_00000133876_AdamRifqyHajat.week03

class Player(val username: String) {
    private var xp: Int = 0
    val level: Int
        get() = (xp/100) + 1

    fun addXp (amount: Int) {
        val temp = level
        xp = xp + amount
        if (level > temp){
            println("Level Up! Selamat ${username} naik ke level ${level}")
        }
    }
}