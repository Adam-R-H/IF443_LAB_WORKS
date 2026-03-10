package oop_00000133876_AdamRifqyHajat.week06

class SmartCCTV(override val name: String, override val id: String) : SmartDevice, Switchable, Recordable {
    override fun turnOff() {
        println ("CCTV mati")
    }

    override fun turnOn() {
        println ("Mulai rekam")
        startRecord()
    }

    override fun startRecord() {
        println ("Memulai rekaman")
    }
}