package oop_00000133876_AdamRifqyHajat.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PETUALANGAN ---")

    print("Masukkan Nama Hero: ")
    val nama = scanner.nextLine()

    print("Masukkan Stat Damage: ")
    val baseDamage = scanner.nextInt()

    val h1 = Hero(nama, baseDamage)
    var enemyHp = 100

    while (h1.isAlive() && enemyHp > 0) {
        print("1. Serang\n2. Kabur\nPilihan: ")
        var pilihan = scanner.nextInt()
        if (pilihan == 1) {
            enemyHp -= baseDamage
            println("Sisa HP musuh ${enemyHp}")
        } else if (pilihan == 2) {
            println("Kaburrrr!")
            break
        }
        if (enemyHp > 0) {
            h1.takeDamage((10..20).random())
        }
    }
    if (enemyHp < 0) {
        println("${h1.name} menang!")
    }
    else if (enemyHp > 0 && !h1.isAlive()) {
        println("Musuh menang...")
    }
}