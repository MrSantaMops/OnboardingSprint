package org.example.level_2

fun main() {
    val employee = 50
    val intern = 30

    val employeeSalary = 30000
    val internSalary = 20000

    val sumSalaryEmployees = employee * employeeSalary
    val sumSalary = intern * internSalary + sumSalaryEmployees
    val theAverageSalaryPerPerson = sumSalary / (intern + employee)

    println(sumSalaryEmployees)
    println(sumSalary)
    println(theAverageSalaryPerPerson)
}