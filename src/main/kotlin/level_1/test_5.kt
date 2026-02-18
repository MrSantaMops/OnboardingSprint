package org.example.level_1

fun main(){

    val inGeneralTimeInSpaceSec: Int = 6480

    val timeInSpaceSec = (inGeneralTimeInSpaceSec % 60).toString().padStart(2, '0')
    val timeInSpaceMin = (inGeneralTimeInSpaceSec % 3600 / 60).toString().padStart(2, '0')
    val timeInSpaceHour = (inGeneralTimeInSpaceSec / 3600).toString().padStart(2, '0')

    println("Time in space: $timeInSpaceHour:$timeInSpaceMin:$timeInSpaceSec")

}