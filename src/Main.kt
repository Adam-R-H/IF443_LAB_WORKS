package oop_00000133876_AdamRifqyHajat.week02

import oop_00000133876_AdamRifqyHajat.week02.oop_00000133876_AdamRifqyHajat.week02.Loan
import java.util.Scanner

fun main(){
    val scanner = Scanner(System. `in`)

    println("--- APLIKASI PEMINJAMAN ---")

    print("Masukkan Judul: ")
    val judul = scanner.nextLine()

    print("Masukkan Nama: ")
    val peminjam = scanner.next()

    print("Masukkan Lama Pinjam: ")
    var lama = scanner.nextInt()

    scanner.nextLine() // Bersihkan buffer newline (Penyakit klasik Scanner!)

    // Validasi di sisi pemanggil (Main)
    if (lama < 0) {
        println("ERROR: Lama pinjam tidak boleh minus! Direset ke 1 hari!")
        lama = 1
    }

    val p1 = Loan(judul, peminjam, lama)

    println("Buku dengan judul ${p1.bookTitle} dipinjam oleh ${p1.borrower} dengan lama pinjam ${p1.loanDuration} hari dan denda ${p1.calculateFine()}")
}