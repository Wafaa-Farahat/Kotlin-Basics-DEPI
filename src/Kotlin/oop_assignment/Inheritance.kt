package Kotlin.oop_assignment

fun main(){
    val myCar = MyCar("Toyota", "Camry", 2022, 4)
    myCar.displayInfo()

    val myMotorcycle = Motorcycle("Harley-Davidson", "Sportster", 2021, true)
    println("\nMotorcycle details:")
    myMotorcycle.displayInfo()
}

open class Vehicle(val brand:String ,val model:String,val year:Int){
   open fun displayInfo(){
        println("Brand : $brand")
        println("Model: $model")
        println("Year : $year")
    }
}

class MyCar(brand:String, model:String, year:Int, val numOfDoors:Int):Vehicle(brand, model, year){
    override fun displayInfo(){
        super.displayInfo()
        println("Number of Doors :$numOfDoors")
    }

}

class Motorcycle( brand:String, model:String, year:Int ,val hasSideCar:Boolean):Vehicle(model=model,brand=brand, year = year){
    override fun displayInfo() {
        super.displayInfo()
        println("Has Side Car :$hasSideCar")
    }
}