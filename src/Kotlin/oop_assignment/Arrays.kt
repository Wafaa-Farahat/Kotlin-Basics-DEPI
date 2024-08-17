package Kotlin.oop_assignment
import java.util.Scanner
import java.text.SimpleDateFormat
import java.util.Date
fun main() {

    // 1. Create an array to store the scores of 10 students
    val scores = IntArray(size = 10)
    val scanner = Scanner(System.`in`)


    // 2. Use a Scanner object to input the scores from the user
    println("Please enter the scores for 10 students:")
    for (i in 0..< scores.size) {
        println("The score for student ${i + 1} :")
        while (true) {
            val input = scanner.nextInt()
            if (input < 0) {
                println("Score cannot be negative. Please enter a valid score:")
            }else{
                scores[i]= input
                break
            }
        }
    }
    // 3. Calculate Sum, Maximum, and Minimum Scores
    var sum =0
    var max=scores[0]
    var mini=scores[0]
    for (score in scores){
        sum+=score
        if (score>max) max=score
        if (score<mini) mini=score
         }
    val average = sum.toDouble() / scores.size
    println("Sum = $sum ,Average=$average Maximun is :$max , Minimum is :$mini")

    // 4. Display the Current Date and Time
    val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val currentDate = dateFormat.format(Date())
    println("Current Date and Time: $currentDate")

    // 5. Sort the scores manually
    for (i in 0 until scores.size-1){
        for (j in i+1 until scores.size){
            if (scores[i]>scores[j]){
                val temp = scores[i]
                scores[i]=scores[j]
                scores[j]=temp
            }
        }
    }
    println("Display Sorted Scores: " + scores.joinToString(", "))


}