package oop_00000133876_AdamRifqyHajat.week02

class Loan (
    val bookTitle: String,
    val borrower: String,
    var loanDuration: Int = 1 // Dalam hari
) {
    fun calculateFine() : Int {
        if (loanDuration > 3){
            return (loanDuration - 3) * 2000
        }
        else{
            return 0
        }
    }
}