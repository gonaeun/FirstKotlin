package org.example

fun main() {
    // 1. List의 선언과 초기화
    // Mutable List (변경 가능한 List)
    val mutableList: MutableList<Int> = mutableListOf(1, 2, 3)
    val firstElement = mutableList[0]  // 첫번째 요소에 접근
    mutableList.add(4)     // 요소 추가
    mutableList.removeAt(1)  // 인덱스 1의 요소 제거
    println(mutableList)

    // Immutable List (변경 불가능한 List)
    val immutableList: List<String> = listOf("apple", "banana", "orange")


    // 2. map : 키와 값의 쌍으로 이루어짐
    // map 선언 및 초기화
    val fruitCount: MutableMap<String, Int> = mutableMapOf("apple" to 5, "banana" to 4, "orange" to 8)

    println(fruitCount)
    println(fruitCount["apple"])  // 요소에 접근. 키값 출력
    println(fruitCount["banana"])
    println(fruitCount["orange"])

    fruitCount["lemon"] = 12
    fruitCount.remove("banana")

    println(fruitCount)

    // 3. 고차함수 : 람다 표현식을 통해 작성

    // 람다 표현식
    // () -> 반환형 = { 이름 없는 함수 }
    val multifly: (a:Int, b:Int) -> Int = { a, b -> a * b }
    println(multifly(3,5))

    // forEach라는 고차함수는 람다표현식을 매개변수로 받는다
    val numbers = listOf(1, 2, 3, 4, 5)

    // 고차함수 표현법1
    numbers.forEach { value -> println(value) }

    // 고차함수 표현법2
    numbers.forEach { println(it) }

    // 고차함수 표현법3
    val printFunction: (Int) -> Unit = { value -> println(value) }
    numbers.forEach(printFunction)

    // 🍯대부분의 반복문은 List와 함께 사용하게 되는데
    // List와 반복문을 함께 사용할 땐, for 대신에 List.forEach를 사용하는게 더 깔끔함



}