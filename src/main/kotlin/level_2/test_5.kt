package org.example.level_2
import kotlin.math.pow

fun main() {
    val sum = 70000
    val percentages = 0.167
    val termYears = 20

    val sumTermYears = sum * (1 + percentages).pow(termYears)
    val formatSumTermYears = String.format("%.3f", sumTermYears)

    println(formatSumTermYears)
}