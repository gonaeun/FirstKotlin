package org.example

fun main() {

    // 1. try-catch
    // try : 예외가 발생할 수 있는 코드
    // catch : 예외가 발생했을 때 수행할 동작
    val userInput = "abc"
    println(safeIntegerConversion(userInput))
}

fun safeIntegerConversion(str: String): Int {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        println("Error: ${e.message}")
        0
    }
}