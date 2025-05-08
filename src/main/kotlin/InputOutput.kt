package org.example

fun main() {
    // 입출력 예시
    val name: String =  "스파르타"
    println(name)
    println("제 이름은 ${name}입니다")


    val dataString = readLine() // 키보드로 입력한 문자열 받기
    println("나는 ${dataString}를 입력했어요!")

    val dataNumber = readLine()!!.toInt()  // 키보드로 입력한 정수형 받기
    val sum = dataNumber + 3
    println("입력은 ${dataNumber}인데 3을 더해서 ${sum}이예요!")
}