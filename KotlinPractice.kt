package tz.ac.suza.hellosuza

fun main() {

    // 1. Variables & Types
    println("----- Question 1 -----")
    val name = "Asia"
    var age = 21

    println("My name is $name and I am $age years old.")


    // 2. Function – Area of a Rectangle
    println("\n----- Question 2 -----")

    fun area(width: Double, height: Double): Double {
        return width * height
    }

    println("Area = ${area(3.0, 4.0)}")


    // 3. Control Flow – Grade Calculator
    println("\n----- Question 3 -----")

    fun grade(score: Int): String {
        return when {
            score >= 80 -> "A"
            score >= 70 -> "B"
            score >= 60 -> "C"
            score >= 50 -> "D"
            else -> "F"
        }
    }

    println("Grade = ${grade(75)}")


    // 4. Loop – FizzBuzz
    println("\n----- Question 4 -----")

    for (i in 1..30) {

        if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
        }

        else if (i % 3 == 0) {
            println("Fizz")
        }

        else if (i % 5 == 0) {
            println("Buzz")
        }

        else {
            println(i)
        }
    }


    // 5. List Operations
    println("\n----- Question 5 -----")

    val nums = listOf(1, 2, 3, 4, 5, 6)

    nums.filter { it % 2 == 0 }
        .map { it * 2 }
        .forEach { println(it) }


    // 6. Classes
    println("\n----- Question 6 -----")

    class Course(val code: String, val title: String, val credits: Int) {

        override fun toString(): String {
            return "$code $title ($credits)"
        }
    }

    val courses = listOf(
        Course("PT822", " Ms Visual Programming", 3),
        Course("MT822", "Mobile Application Development", 4),
        Course("WT822", "Advanced Website Programming", 2)
    )

    courses.forEach {
        println(it)
    }


    // 7. Null Safety
    println("\n----- Question 7 -----")

    val name2: String? = readLine()

    println(name2?.length ?: 0)

}