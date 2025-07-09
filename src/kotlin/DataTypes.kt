fun main() {
    var n = 10
    var l = 100L
    var d = 3.14
    var f = 3.14f
    var b = true
    var s = "Izzatillo"
    var c = 'I'

    var number: Any = 2
    var name: Any = "Izzatillo"

    // var vs val

    var brand = "Izzatillo"
    brand = "Izzatillo swe"

    // final String brand = "Izzatillo"
    val brandVal =  "Izzatillo"
//    brandVal = "Izzatillo swe"

    val email = """
        Hello %s
           How 
        are you 
    """.trimIndent()

    println(email.format("Izzatillo"))

    println(kotlin.math.max(3, 2))

}
