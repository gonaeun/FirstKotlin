package org.example.InheritanceStudy

// Kotlin에서는 open 키워드를 통해서 상속관계 만듦
open class Bird(
    var name: String  // 생성자를 사용하는 경우
) {
    open fun fly() {   // fly를 오버라이딩 하기 위해 open 키워드 추가
        println("${name} 날아요~")
    }

}

// 상속에서 생성자를 사용하는 경우, 자식객체에서도 Bird의 생성자를 호출하면서 그 값(name)을 전달해줘야 함
class Chicken(name: String) : Bird(name) {

}

// 오버라이딩
// 상속받은 부모 클래스의 메소드를 재설계 (자식 클래스의 개성 살리기)
class Sparrow(
    name: String,
    val color: String
) : Bird(name) {

    override fun fly() {
//        super객체는 부모의 객체를 의미하며 자동으로 생성됨
//        즉 부모객체의 fly메소드를 부르는 행위임
//        부모의 기능을 어느정도 활용하면서 오버라이딩 하고싶으면, super.fly()
        println("${color}의 ${name}이 날아봅니다~ 짹짹!")
    }
}

class Pigeon(name: String) : Bird(name) {

}