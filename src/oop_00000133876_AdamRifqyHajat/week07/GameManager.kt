package oop_00000133876_AdamRifqyHajat.week07

object GameManager {
    var isGameRunning: Boolean = false

    fun startGame() {
        if (!isGameRunning) {
            isGameRunning = true
        } else{
          println("Game sudah berjalan!")
        }
    }
}