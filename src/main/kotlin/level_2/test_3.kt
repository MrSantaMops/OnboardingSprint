package org.example.level_2

fun main() {
    val timeHour = 9
    val timeMinute = 39
    val road = 457

    val timeRoad = (timeHour * 60) + timeMinute + road
    val arrivalInHour = (timeRoad / 60).toString().padStart(2, '0')
    val arvalInMinute = (timeRoad % 60).toString().padStart(2, '0')

    println("$arrivalInHour:$arvalInMinute")
}