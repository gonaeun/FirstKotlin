package org.example.homework

// 1. 사용자에게 메뉴를 입력받아서 각 메뉴에 해당하는 기능 실행
// - 프로그램을 실행하면 화면에 메뉴를 입력해주세요 라는 문구와 함꼐 선택할 수 있는 메뉴 출력
// - 게임 시작하기 메뉴
// - 게임 끝내기 메뉴
// HINT) WHEN문 사용하기, 각 메뉴를 함수로 만들어주기
// 2. 캐릭터 추가 메뉴 구현
// - 캐릭터는 이름과 직업을 가짐
// - 사용자로부터 추가할 캐릭터의 이름과 직업을 입력받고
// - 입력받은 캐릭터를 저장
// - 캐릭터를 저장한 후 더 추가할 것인지 물어보기
// - Y : 캐릭터 추가 반복
// - N : 지금까지 추가한 캐릭터 목록 출력
// HINT) 캐릭터가 이름과 직업 정보를 함께 가지려면, MAP형태로 저장
// HINT) 지금까지 추가한 캐릭터 여러명을 가지고 있으려면, List 형태로 저장
// 3. 사용자가 메뉴를 잘못 선택했을 경우, 다시 선택하라는 안내메시지 출력하고 다시 입력받기
// HINT) 잘못된 상황을 표현하기 위해 Exception 일으키기
// HINT) try-catch문을 통해 잘못된 상황에 대한 처리하기

fun main() {
    var isValidMenu = false
    var selectedMenu = 0

    while (isValidMenu == false) {
        try {
            selectedMenu = getMenuNumber()
            isValidMenu = true
        } catch (e: Exception) {
            isValidMenu = false
        }
    }

    when (selectedMenu) {
        1 -> startGame()
        2 -> createCharacter()
        3 -> endGame()
    }
}

fun getMenuNumber(): Int {
    println("메뉴를 입력해주세요.")
    println("1. 게임 시작하기")
    println("2. 캐릭터 추가")
    println("3. 게임 끝내기")

    val userInput = readLine()!!.toInt()

    if (userInput < 1 || userInput > 3) {
        throw Exception("입력이 잘못되었습니다.")
    }

    return userInput
}


fun startGame() {
    println("게임이 시작되었습니다.")
}

fun createCharacter() {
    val characterList: MutableList<Map<String, String>> = mutableListOf()

    var isNeedMoreCharacter = "Y"

    while (isNeedMoreCharacter == "Y") {
        println("추가할 캐릭터의 이름을 입력해주세요.")
        val name = readLine() ?: ""

        println("추가할 캐릭터의 직업을 입력해주세요.")
        val job = readLine() ?: ""

        val character = mapOf("name" to name, "job" to job)

        characterList.add(character)

        println("사용자를 더 추가하시겠습니까? (Y: 추가, N: 그만두기)")
        isNeedMoreCharacter = readLine() ?: "N"
    }

    characterList.forEach {
        println(it)
    }
}

fun endGame() {
    println("게임이 종료되었습니다.")
}