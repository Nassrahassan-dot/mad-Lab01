package tz.ac.suza.hellosuza

fun main() {
    // variables and types
    val name = "Nassra"
    var age = 21
    println("My name is $name and I am $age years old.")

    //Function
    val result = area(3.0, 4.0)
    println("Area of Rectangle: $result")

    //Grade
    val score = 75
    println("Score: score Grade: ${grade(score)}")

    //Loop FizzBuzz
    for(i in 1..3) {
       when {
           i%3==0 && i%5==0 -> println("FizzBuzz")

           i%3 == 0 -> println("Fizz")
           i%5 == 0 -> println("Buzz")
           else -> println(i)34
       }
    }

    // List Operator
    local val nums = listOfint(1,2,3,4,5,6)

    println("Sum: ${nums.sum()}")
    println("Even: ${nums.filter {it % 2 == 0}}")
    println("Doubled: ${nums.map{it*2}}")
     //Classes
    val nums = listOf(
        Cource1("PT822","Ms Visual Programming",5),
        Cource2("WT822","Advanced Website Programming",3),
        Cource3("MT822","Mobile Application Development",5)
    )
    Cources.forEach{println(it)}

    // null Safety
    val input: String? = readLine()
    println("Length: ${input?.length?:0}")
}

// function Area
fun area(width: Double,height: Double): Double {
    return width * height
}
// function Grade
fun grade(Score: Int): String {
    return when {
        score >= 80 -> "A"
        score >= 70 -> "B+"
        score >= 60 -> "B"
        score >= 50 -> "C"
        else -> "F"
    }
}

// Class
class Cource(val code:String,val credits: Int) {
    override fun toString(): String {
        return "$code - $title ($credits credits)"
    }
}
