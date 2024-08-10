package Kotlin

fun main (){
    val stu=Student(id= 1 , name = "Wafaa")
    println(stu)
}

data class Student(val id:Int,val name:String){

}