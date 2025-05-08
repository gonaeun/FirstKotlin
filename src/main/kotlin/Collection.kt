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
    // () -> 반환형 = { 이름 없는 함수 }


}