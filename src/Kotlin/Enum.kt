package Kotlin

fun main(){
    for (x in Role.entries){
        println("the Name is ${x.name} and he has ${x.role}")
    }
}

enum class Role(val role:String){
    Admin (role = "All privileges"), Moderator(role = "can edit") , User(role = "no authority")
}
