package oop_00000133876_AdamRifqyHajat.week06.oop_00000133876_AdamRifqyHajat.week07

class DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect() {
        connectionStatus = "Connected to Server"
        println("Database is ready.")
    }
}