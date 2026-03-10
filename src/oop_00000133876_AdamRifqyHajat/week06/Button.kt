package oop_00000133876_AdamRifqyHajat.week06

class Button(override val name: String) : Clickable {
    override fun click() {
        println("Tombol '${name}' berhasil diklik!")
    }
}