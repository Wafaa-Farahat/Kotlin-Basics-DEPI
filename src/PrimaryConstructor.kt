fun main(){
var person= Invoice(1 , name = "wafaa", total = 175.6)
}

class Invoice(id:Int ,name:String, total:Double ){
    init {
        println("id :$id , name:$name , total:$total")
    }
}