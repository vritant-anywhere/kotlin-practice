import java.util.Calendar

fun main(args:Array<String>) {
    //println("Hello ${args[0].toInt()}")
    println(if (args[0].toInt()<12) print("Good Morning") else print("Good Night"))
    dayOfWeek()
    val mood="happy"
    val day="sunday"
    println(when{mood=="happy" && day=="sunday" -> "Good Day"
        else -> {"Bad day"}
    })

    println(isDirty(20))

    val materials = listOf("Rock","Plastic","Polycarbonate","Carbon fibre")

    println(materials.filter { it[0]=='P' })  //filter function
}

fun isDirty(dirty : Int) = dirty>30  //simplifying function definition

private fun dayOfWeek()
{
    println(when(Calendar.DAY_OF_WEEK)
    {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Time has stopped"
    })
}