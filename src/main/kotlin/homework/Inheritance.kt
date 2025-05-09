package org.example.homework

// 상속을 통해 방어구를 가진 캐릭터 클래스 만들기
// 1. 캐릭터 클래스는 공격과 공격 당하기를 할 수 있어요.
// - 공격을 하면 상대방에게 공격할 데미지를 전달해요.
// - 공격을 당하면 데미지만큼 자신의 체력이 감소해요.
// 2. 방어구를 가진 캐릭터 클래스는 공격과 방어를 할 수 있어요.
// - 공격을 하면 상대방에게 공격할 데미지를 전달해요.
// - 공격을 당하면 데미지에서 방어력을 제한만큼 자신의 체력이 감소해요.

open class Character {
    val damage = 10
    var healthPoint = 100

    fun attack(target: Character) {
        target.takeAttack(damage)
    }

    open fun takeAttack(damage: Int) {
        healthPoint -= damage
    }
}


class CharacterWithArmor: Character() {
    val defensePoint = 3

    override fun takeAttack(damage: Int) {
        val actualDamage = damage - defensePoint

        super.takeAttack(actualDamage)
    }
}