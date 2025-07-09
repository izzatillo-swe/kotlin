fun main() {
//    val input = "MS"
//
//    val gender = when (input) {
//        "F" -> "FEMALE"
//        "M" -> "MALE"
//        else -> {
//            "Unknown gender"
//        }
//    }
//    println(gender)

//    val i = 8
//
//    when {
//        (i == 1) -> println("one")
//        (i == 2) -> println("two")
//        (i == 3) -> println("three")
//        (i == 4) -> println("four")
//        (i == 5) -> println("five")
//        else -> println("unknown")
//    }

    val age = 8

    when (age) {
        in 1..12 -> println("child")
        in 13..19 -> println("teenager")
        in 20..50 -> println("extreme")
        else  -> println("old")
    }
}