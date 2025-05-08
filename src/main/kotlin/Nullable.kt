package org.example

fun main() {
    // nullable type 다루기

    // 1. 조건문 검사 : null checking
    val nullableString1: String? = "this is nullalble string"

    if (nullableString1 != null) {
        println(nullableString1.length)
    }

    // 2. elvis 연산자 : 변수가 null일 경우 대신 사용할 값 지정
    // ?: 의 앞에 있는 변수가 null일 때, 뒤에 있는 값으로 사용해라
    val nullableString2: String? = null

    println((nullableString2 ?: "").length)  // 0 출력


    // 3. 세이프 콜 : 변수가 null이 아닐 경우에만 실행할 구문 지정
    // ?.let { 람다표현식 }
    val nullableString3: String? = "this is nullalble string"

    nullableString3?.let {
        println(it.length)
    }

    // 4. 단언 연산자 : 변수가 null이 아님을 개발자가 확신할 때 사용
    // !!
    val nullableString4: String? = "this is nullalble string"

    println(nullableString4!!.length)
}