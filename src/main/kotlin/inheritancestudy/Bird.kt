package org.example.InheritanceStudy

// Kotlin에서는 open 키워드를 통해서 상속관계 만듦
open class Bird(
    var name: String  // 생성자를 사용하는 경우
) {
    fun fly() {
        println("${name} 날아요~")
    }

}

// 생성자를 사용하는 경우, 자식객체에서도 Bird의 생성자를 호출하면서 그 값(name)을 전달해줘야 함
class Chicken(name: String) : Bird(name) {

}

class Sparrow(name: String) : Bird(name) {

}

class Pigeon(name: String) : Bird(name) {

}