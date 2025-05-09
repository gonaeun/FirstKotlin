package org.example.InterfaceStudy

import org.example.combinationstudy.Bag
import org.example.combinationstudy.Item

class Hero(val bag: Bag): Character {
    var damage = 10
    var healthPoint = 100

    override fun attack(target: Character) {
        println("공격했다!")
        target.takeAttack(this.damage)
    }

    override fun takeAttack(damage: Int) {
        println("공격받았다!")
        this.healthPoint -= damage
    }

    fun takeItem(item: Item) {
        bag.takeItem(item)
        // Hero는 Bag을 상속하지 않음
        // Bag을 멤버 변수로 가지고, 가방의 기능을 위임해서 사용
    }
}