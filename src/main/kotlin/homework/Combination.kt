package org.example.homework

// 조합을 통해 방어구를 가진 캐릭터 클래스 만들기
// 1. 캐릭터 클래스는 공격과 공격 당하기를 할 수 있어요.
// - 공격을 하면 상대방에게 공격할 데미지를 전달해요.
// - 공격을 당하면 데미지만큼 자신의 체력이 감소해요.
// 2. 방어구를 가진 캐릭터 클래스는 공격과 방어를 할 수 있어요.
// - 공격을 하면 상대방에게 공격할 데미지를 전달해요.
// - 공격을 당하면 데미지에서 방어력을 제한만큼 자신의 체력이 감소해요.

class Character3(
    val armor: Armor?,
) {
    val damage = 10
    var healthPoint = 100

    fun attack(target: Character3) {
        target.takeAttack(damage)
    }

    fun takeAttack(damage: Int) {
        val defensedDamage = armor?.getDefensedDamage(damage) ?: damage
        healthPoint -= defensedDamage
    }
}


fun main() {
    val characterWithoutArmor = Character3(armor = null)
    val characterWithArmor = Character3(Armor(defensePoint = 3))

    characterWithoutArmor.takeAttack(damage = 10)
    println(characterWithoutArmor.healthPoint)

    characterWithArmor.takeAttack(damage = 10)
    println(characterWithArmor.healthPoint)
}


class Armor(
    val defensePoint: Int
) {
    fun getDefensedDamage(damage: Int): Int {
        return (damage - defensePoint).coerceAtLeast(0)
    }
}
