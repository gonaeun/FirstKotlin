package org.example

fun main() {
    // 고차함수 활용하기

    // 1. collection끼리 변환할 때 고차함수 사용
    val list = listOf("apple", "banana", "orange")
    println(list)
    val mapFromList = list.associateWith { it.length }  // 람다표현식을 받았기 때문에 associateWith는 고차함수
    println(mapFromList)  // 리스트로 변환

    val map = mapOf("apple" to 5, "banana" to 3, "orange" to 8)
    println(map)
    val listFromMap = map.toList()
    println(listFromMap)  // 튜플로 변환


    // 2. list 고차함수 활용
    val people = listOf(
        mapOf("name" to "김르탄", "age" to 27),
        mapOf("name" to "이스파", "age" to 18),
        mapOf("name" to "최개발", "age" to 54),
        mapOf("name" to "박코딩", "age" to 32),
    )

    println(people)

    // 하나씩 출력 (기존방법)
    for (person in people) {
        println(person)
    }

    // 하나씩 출력 (람다표현식의 고차함수 활용)
    people.forEach { println(it) }


    // 필터 기능도 고차함수 활용
    // filter는 boolean(true/false)를 반환하는 람다표현식을 받아야하며
    // 람다표현식을 통해 true로 받은것만 남기는 고차 함수 기능.

    people.filter {  // true/false값을 받아서 true 결과물만 남겨서 List화
        val age = it["age"]

        if (age is Int) { // 형변환 해주고
            age >= 30  // 조건 걸기, true를 필터에 반환
        } else {
            false
        }
    }.forEach {  // List 정렬해서 출력
        println(it)
    }
}