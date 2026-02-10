package oop_00000133876_AdamRifqyHajat.week02

class Student (
    val name: String,
    val nim: String,
    var major: String,
    var gpa: Double = 0.0, // <-- Default Argument

) {
    init {
        // Validasi Sederhana: Cek panjang NIM
        if (nim.length != 5) {
            println("WARNING Object tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Object student $name berhasil dialokasikan di Memory.")
        }
    }
    // Secondary Constructor
    // Wajib memanggil Primary Constructor menggunakan 'this()'
    constructor(name: String, nim: String) : this(name, nim, "Non-Matriculated"){
     println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }
}