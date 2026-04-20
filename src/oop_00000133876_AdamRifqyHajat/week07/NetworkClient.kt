package oop_00000133876_AdamRifqyHajat.week07

class NetworkClient private constructor(val url: String) {
    companion object {
        const val BASE_URL = "http://api.umn.ac.id" // Shared constant

        fun createClient(): NetworkClient {
            println("Membangun NetworkClient defan BASE_URL: $BASE_URL")
            return NetworkClient(BASE_URL)
        }
    }
    fun connect() {
        println("Connecting to $url...")
    }
}