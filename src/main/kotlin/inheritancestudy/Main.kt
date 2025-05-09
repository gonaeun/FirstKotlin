package org.example.InheritanceStudy

fun main() {
    val bird = Bird("새")
    val chicken = Chicken("닭")
    val sparrow = Sparrow("참새", "갈색")
    val pigeon = Pigeon("비둘기")

    bird.fly()
    chicken.fly()
    sparrow.fly()
    pigeon.fly()
}
