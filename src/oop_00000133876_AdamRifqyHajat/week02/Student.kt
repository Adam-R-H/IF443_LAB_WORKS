package oop_00000133876_AdamRifqyHajat.week02

class Student (val name: String, val nim: String, var major: String) {
    init {
        // Validasi Sederhana: Cek panjang NIM
        if (nim.length != 5) {
            println("WARNING Object tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Object student $name berhasil dialokasikan di Memory.")
        }
    }
}