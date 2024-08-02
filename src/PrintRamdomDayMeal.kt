fun main(){
    val meals= listOf("Pizza","Burger","Steak","Bread","Chicken")
    val daysOfWeek = listOf(
        "Sunday",
        "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday"
    )
    for(day in daysOfWeek)
        randomDayMeal(days=daysOfWeek,meals=meals)
}

fun randomDayMeal(days: List<String>, meals: List<String>){
val randomDay=days.random()
    val randomMeal=meals.random()

    println("The day is :$randomDay,The meal is :$randomMeal")
}