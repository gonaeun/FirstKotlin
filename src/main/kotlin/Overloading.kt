package org.example

// 오버로딩 : 같은 이름의 함수를 매개변수만 다르게 여러개 정의하는 것
// 호출할 때마다 인자를 어떻게 넘겼느냐에 따라 각각 다른 함수가 호출됨

fun main() {
    var calc = Calculator()

    var intResult = calc.add(1,2)
    var doubleResult = calc.add(1.2, 2.2)

    println("정수 덧셈결과: ${intResult}")
    println("실수 덧셈결과: ${doubleResult}")

}

class Calculator {

    fun add(num1: Int, num2: Int): Int {
        println("int형 add입니다")
        return num1+num2
    }

    fun add(num1: Double, num2: Double): Double {
        println("double형 add입니다")
        return num1+num2
    }
}