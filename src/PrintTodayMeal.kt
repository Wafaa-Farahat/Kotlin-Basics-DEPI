import java.time.LocalDate

fun main(){
    todayMeal("Pasta")
}

fun todayMeal(meal:String){
    val today = LocalDate.now().dayOfWeek ;
    println("Today is : $today , the meal is $meal")
}