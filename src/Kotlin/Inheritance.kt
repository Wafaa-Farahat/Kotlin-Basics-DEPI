package Kotlin
fun main(){
val cir1= Circle(name = "Circle", color = "Green" , radius = 7.0);
    val rec1=Rectangle(name = "Rectangle", color = "White" , width = 9.0 , height = 6.0)
    cir1.displayInfo()
    rec1.displayInfo()

}
open class Shape(val name :String , val color:String){
    open fun area():Double{
        return 0.0;
    }
    fun displayInfo(){
        println("Shape: $name")
        println("color: $color")
        println("Area: ${area()}")
    }
}
class Circle (name: String, color: String , val radius :Double):Shape(name,color){
    override fun area(): Double {
        return Math.PI*radius*radius
    }
}
class Rectangle (name: String, color: String , val width :Double , val height :Double):Shape(name,color){
    override fun area(): Double {
        return width*height
    }
}

