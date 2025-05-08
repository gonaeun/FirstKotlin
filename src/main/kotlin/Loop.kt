package org.example

fun main() {
    // for을 이용하여 내 이름 10번 출력하기
    for(i in 1..10) {
        println("${i}번째 : 내 이름은 참새")
    }

    // while을 이용하여 내 이름 10번 출력하기
    var i = 1;

    while(i < 11) {
        println("${i}번째 : 내 이름은 참새")
        i++
    }

    // 전화번호부에서 참새 찾기
    var infos = arrayOf("꿩", "닭", "참새", "오목눈이", "공작새")

    for(info in infos) {
        if(info == "참새"){
            println("찾았다 참새!")
            break // for문 탈출
        } else {
            println(1)
            continue // 뒤에 있는 코드를 건너뜀
            println(2) // 이거 출력 안되고 바로 for문 맨 앞으로 이동
        }
    }

    // 고양이에게 사료 10번 주기
    var catStatus = false;
    println("고양이는 배고파요")
    println("사료를 10번 먹여주세요")

    if(catStatus==false){
        for(idx in 1..10) {
            println("${idx}번째 : 냠냠")
        }
    }

    catStatus = true
    if(catStatus==true){
        println("배부른 고냥이")
    }


}
