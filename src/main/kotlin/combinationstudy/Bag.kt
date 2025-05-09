package org.example.combinationstudy

// 조합 : 중복되는 로직들을 갖는 객체를 구현하고, 이 객체를 주입받아 중복 로직 호출하는 방법
// 유연성, 확장성이 떨어지는 상속의 문제점 해결

// Bag 클래스는 조합의 대상이 되는 클래스. Hero등 다른 객체에 포함되어 있음

class Bag(
    val maxWeight: Int,
    var currentWeight: Int = 0,
    ) {
    var itemList: MutableList<Item> = mutableListOf()

    fun takeItem(item: Item) {
    // currentWeight가 maxWeight을 넘으면 아이템을 가방에 추가할 수 없게 하는 로직도 여기에 작성
    }
}

class Item(
    val name: String,
    val weight: Int
)
