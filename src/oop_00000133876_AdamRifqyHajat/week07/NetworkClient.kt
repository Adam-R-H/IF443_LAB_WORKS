package oop_00000133876_AdamRifqyHajat.week06.oop_00000133876_AdamRifqyHajat.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}