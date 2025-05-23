package org.example.InterfaceStudy

class Enemy(): Character {
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
}