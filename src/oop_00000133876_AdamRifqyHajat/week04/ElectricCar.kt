package oop_00000133876_AdamRifqyHajat.week04

class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int) : Car(brand, numberOfDoors) {
    final override fun accelerate(){
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%")
    }
}