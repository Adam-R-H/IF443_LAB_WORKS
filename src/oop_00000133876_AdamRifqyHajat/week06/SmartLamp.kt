package oop_00000133876_AdamRifqyHajat.week06

class SmartLamp(override val name: String, override val id: String) : SmartDevice, Switchable {
    override fun turnOff() {
        println ("Lampu menyala")
    }

    override fun turnOn() {
        println ("Lampu mati")
    }
}