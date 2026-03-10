package oop_00000133876_AdamRifqyHajat.week05.oop_00000133876_AdamRifqyHajat.week06

interface Clickable {
    // ERROR: Property in an interface canot have a backing field
    val name: String = "Tombol Rahasia"

    // Function without body (Implicitly Abstract)
    fun click()
}