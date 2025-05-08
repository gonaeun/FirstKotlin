package org.example

fun main() {
    // 기본타입 형변환
    val intString: String = "123"
    println(intString + 5)
    val int = intString.toInt() // int로 형변환
    println(int + 123)

    // 스마트 캐스트 : 조건문을 통해 타입 검사를 해서 안전하게 형변환
    val value: Any = "this is any type value" // Any형에는 어떤 타입이든 들어올 수 있다
    // value.length  // value의 타입을 모르니까 length 기능 쓸 수 없음. Unresolved Reference 에러

    if(value is String) { // value의 타입 검사
        // value가 String 타입이면 자동으로 Strinㅎ으로 형변환되어 String의 length 기능 사용 가능
        println(value.length)
    }

    // 명시적 형변환
    value as String
    println(value.length)
}