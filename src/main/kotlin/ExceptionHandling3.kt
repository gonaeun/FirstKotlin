package org.example

// 3. 흐름제어를 위해 throw 사용
fun main() {
    try {
        validateInput("")
    } catch (e: IllegalArgumentException) {  // catch문은 if문이나 마찬가지로 사용되잖아("이런 e가 발생하면 실행해")
        println("Caught an exception: ${e.message}")
    }
}

// 로깅용으로 throw 생성해서 위에 try-catch문에서 사용
fun validateInput(input: String) {
    // "String이 blank면 illegalArgumentException을 발생시켜라"
    if (input.isBlank()) {
        throw IllegalArgumentException("Input should not be blank.")   // if문에 throw 키워드를 사용해
    }
    println("Input is valid: $input")
}