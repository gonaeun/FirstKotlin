package org.example

// 2. finally
// 예외 발생에 관계없이 항상 실행해야하는 동작 작성

fun main() {
    // 실행되지 않는 코드입니다.
    // performFileOperations()
}

//fun performFileOperations() {
//    val file = File("example.txt")
//
//    try {
//        // 파일 관련 작업 수행
//        println("File operations performed.")
//    } finally {
//        // !항상 실행되는 블록!
//        file.close()
//        println("File closed.")
//    }
//}