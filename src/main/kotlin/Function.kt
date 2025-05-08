package org.example

fun main() {
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()

    sum(num1, num2)

    dayInfo()
}

fun sum(int1: Int, int2: Int) {
    val result = int1 + int2
    println("연산 결과는 ${result}입니다.")
}

fun dayInfo() : Unit {  // 반환 타입이 없을때는 Unit으로 명시하거나 생략
    println("오늘의 날씨는 화창합니다")
    println("오늘은 검정색을 조심하세요")
}