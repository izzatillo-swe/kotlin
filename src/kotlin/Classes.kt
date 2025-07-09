fun main() {

    val tv = SmartDevice()
    tv.brand = "Samsung"
    tv.price = 1000.00
    tv.turnOff()

    val phone = SmartDevice()
    phone.brand = "Apple"
    phone.price = 1200.00
    phone.turnOff()

}

class SmartDevice {
    var brand: String = ""
    var price: Double = 0.0

    fun turnOn() {
        println("$brand is switching on")
    }

    fun turnOff() {
        println("$brand is switching off")
    }


}