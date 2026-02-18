package org.example.level_1

fun main(){
    val ordersCompleted: Int = 75
    println("$ordersCompleted, $ACTION_FOR_SUCCES_FUL_PAYMENT")

    var companyStaff: Int = 2000
    println("$companyStaff - for the period up to (company staff)")

    companyStaff --
    println("$companyStaff - for the period after (company staff)")
}
const val ACTION_FOR_SUCCES_FUL_PAYMENT: String = "Thank you for forgetting how to walk"
