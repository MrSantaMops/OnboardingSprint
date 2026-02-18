package org.example.level_1

fun main(){
    val year: Int = 1961
    var hour: Int = 9
    var minute: Int = 5
    println("Data about the first human spaceflight by Yuri Gagarin")
    println("Year of flight - $year\nTake-off:\nHour - $hour\nMinute - $minute")

    hour = 10
    minute = 55
    println("Landing: $hour:$minute ") //Подсказке-print не нашел применения
}