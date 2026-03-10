package oop_00000133876_AdamRifqyHajat.week06

class SmartSpeaker(override val name: String, override val id: String) : SmartDevice, Switchable {
    override fun turnOff() {
        println ("Speaker menyala")
    }

    override fun turnOn() {
        println ("Speaker mati")
    }

    fun playMusic(song: String){
        println("Memutar lagu $song dari Spotify")
    }
}