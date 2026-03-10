package oop_00000133876_AdamRifqyHajat.week06

class SmartSpeaker(override val name: String, override val id: String) : SmartDevice, Switchable, Recordable {
    override fun turnOff() {
        println ("Speaker menyala")
    }

    override fun turnOn() {
        println ("Speaker mati")
    }

    override fun startRecord() {
        println("Perekaman mulai")
    }

    fun playMusic(song: String){
        println("Memutar lagu $song dari Spotify")
    }
}