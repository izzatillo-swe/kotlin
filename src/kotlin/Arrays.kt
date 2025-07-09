fun main() {
    val names = arrayOf("John", "Jane", "Doe", 2, 3)
    val namesOnly = arrayOf<String>("John", "Jane", "Doe")
    println(namesOnly.contentToString())
    if ("Doe" in namesOnly) {
        println("Found")
    } else {
        println("Not found")
    }
}