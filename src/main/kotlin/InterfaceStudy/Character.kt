package org.example.InterfaceStudy

// 인터페이스
// 특정 기능을 가진 메소드의 집합을 정의하는 추상화 구조
// 클래스가 특정한 메소드를 구현하도록 강제함

// 인터페이스의 구조
// interface 인터페이스이름 {
//     fun 메소드이름(): 반환형
// }

interface Character {
    fun attack(target: Character)
    fun takeAttack(damage: Int)
}