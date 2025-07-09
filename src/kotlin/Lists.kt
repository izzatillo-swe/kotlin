fun main() {
//    val list = listOf("John", "Jane", "Doe")
//    println(list[0])
//    println(list.size)
//    println(list.contains("John"))

    val names = mutableListOf("John", "Jane", "Doe")
    println(names[0])
    println(names.size)
    println(names.contains("John"))
    names.add("Alex")
    println(names[3])
}