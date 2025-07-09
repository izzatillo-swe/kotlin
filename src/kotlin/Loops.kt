fun main() {
    val names = listOf("John", "Jane", "Doe")
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7)

    for (name in names) {
        println(name)
    }

    for (number in numbers) {
        println(number)
    }

    println("range")
    for (i in 1..10) println(i)
    println("downTo")
    for (i in 10 downTo 1) println(i)
    println("steps")
    for (i in 1..10 step 2) println(i)

    names.forEach {
        println(it)
    }
}