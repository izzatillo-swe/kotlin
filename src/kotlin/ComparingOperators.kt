fun main() {
    val n1 = 31
    val n2 = 20

//    if (n1 >= n2 && n1 <= 30) {
//        println(":)")
//    } else {
//        println(":(")
//    }

//    val value = if (n1 >= n2 && n1 <= 30) {
//        println(":)")
//    } else {
//        println(":(")
//    }

//    val value = if  (n1 > n2) ":)" else ":("

    val value =
        if  (n1 > n2) ":)"
        else if (n1 == 100) "hooray"
        else ":("

    println(value)
}