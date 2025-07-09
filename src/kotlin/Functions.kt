fun main() {
    greet(age = 19, name = "Jamila")
    greet("Job")
    greet("Alex", 15)

    println(double(10))

    println()

    val (v1, v2) = twoValues()
    println("v1: $v1, v2: $v2")

    val (t1, t2,  t3) = threeValues()
    println("t1: $t1, t2: $t2, t3: $t3")
}

//fun double(n: Int) : Int {
//    return n * 2
//}

fun double(n: Int) = n * 2

fun twoValues() : Pair<String, Int> = "Izzatillo" to 20

fun threeValues() : Triple<String, Int, Int> {
    return Triple("Izzatillo", 5, 13)
}

fun greet(name: String, age: Int = -1) {
    println("Hello $name")
    if (age == -1) {
        println("age is not provided")
        return
    }
    if (age >= 16) {
        println("$name is an adult")
    } else {
        println("$name is not an adult")
    }
}