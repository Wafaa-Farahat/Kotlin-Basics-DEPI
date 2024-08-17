package Kotlin.oop_assignment

fun main() {
    // Creating an instance of Car
    val myCar = Car("Toyota", "Corolla", 2021, "Red")
    println("Brand: ${myCar.brand}")
    println("Model: ${myCar.model}")
    println("Year: ${myCar.year}")
    println("Color: ${myCar.color}")

    myCar.brand = "Honda"
    myCar.model = "Civic"
    myCar.year = 2022
    myCar.color = "Blue"
    println("Updated Brand: ${myCar.brand}")
    println("Updated Model: ${myCar.model}")
    println("Updated Year: ${myCar.year}")
    println("Updated Color: ${myCar.color}")

    // Calling methods
    myCar.startEngine()
    myCar.drive(120)
}

class Car(private var _brand: String, private var _model: String, private var _year: Int, private var _color: String) {

    var brand: String
        get() {
            return _brand
        }
        set(value) {
            _brand = value
        }

    var model: String
        get() {
            return _model
        }
        set(value) {
            _model = value
        }

    var year: Int
        get() {
            return _year
        }
        set(value) {
            _year = value
        }

    var color: String
        get() {
            return _color
        }
        set(value) {
            _color = value
        }
    fun startEngine() {
        println("The engine is starting.")
    }
    fun drive(distance: Int) {
        println("The car has driven $distance miles")
    }
}


//class Car (private var brand:String ,private var model:String,private var year :Int ,private var color:String){
//    fun setBrand(brand: String){
//    this.brand =brand
//}
//    fun getBrand():String{
//     return brand
// }
//    fun setModel(model: String){
//        this.model =model
//    }
//    fun getModel():String{
//        return model
//    }
//    fun setYear(year: Int){
//        this.year =year
//    }
//    fun getYear():Int{
//        return  year
//    }
//    fun setColor(color: String){
//        this.color =color
//    }
//    fun getColor():String{
//        return  color
//    }
//    fun startEngine(){
//        println("The engine is starting.")
//    }
//    fun  drive(distance:Int){
//        println("The car has driven $distance miles")
//    }
//
//
//}