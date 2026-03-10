package oop_00000133876_AdamRifqyHajat.week06

interface SmartDevice {
    val id: String
    val name: String
}

interface Switchable{
    abstract  fun turnOn()
    abstract  fun turnOff()
}

interface Recordable{
    abstract fun startRecord()
    fun stopRecord(){
        println("Perekaman dihentikan dan disimpan ke Cloud")
    }
}