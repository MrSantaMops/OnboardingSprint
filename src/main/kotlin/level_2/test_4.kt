package org.example.level_2

fun main() {
    val prosent = 0.2
    val crystals = 7
    val iron = 11

    val buffIron = (iron + iron * prosent).toInt()
    val buffCrystals = (crystals + crystals * prosent).toInt()

    println("Iron: $iron\nCrystals: $crystals\n")
    println("Iron+buff: $buffIron\nCrystals+buff: $buffCrystals")
}