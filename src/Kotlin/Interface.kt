package Kotlin

fun main() {
    val c1=Car("BMW" , "2018");
println(c1.startEngine())
    c1.stopEngine()

}

interface Vehicle {
    fun startEngine(): String
    fun stopEngine(): String
    fun brake(): String
}

class Car(val brand: String, val model: String) : Vehicle {
    override fun startEngine(): String {
        return "$brand engine started."
    }

    override fun stopEngine(): String {
        return "$brand engine stopped."
    }

    override fun brake(): String {
        return "$brand is braking"
    }
}
