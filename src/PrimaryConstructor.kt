fun main(){
//var person= Invoice(1 , name = "wafaa", total = 175.6)

//    var circle1=Circle(name = "wafaa" )
    var diameter=Circle(dia=12)

}
// primary constructor
class Invoice(id:Int ,name:String, total:Double ){
    init {
        println("id :$id , name:$name , total:$total")
    }
}

// multiple constructor
class Circle(radius:Double){
    constructor(name: String):this(radius = 2.5)
    constructor(dia:Int ):this(radius = dia/2.0){
        println("Diameter =  $dia")
    }
    init {
        println("radius = $radius ")
        println("Area of circle = ${Math.PI * radius * radius}")

    }
}