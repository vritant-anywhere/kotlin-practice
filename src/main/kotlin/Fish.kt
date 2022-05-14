
class Fish(friendly : Boolean = true, var volumeNeeded:Int) {

    constructor(a:Int) : this(volumeNeeded = 5)
    {
        println("constructor $a")
    }

    constructor(b:Int,c:Int) : this(volumeNeeded = 5)
    {
        //val fish = Fish(5)
        println("2nd const $b , $c")
    }

    private val size : Int
    init {

        println("init block")
        size = if (friendly) {
            volumeNeeded
        } else{
            volumeNeeded*2
        }
    }

    val sum = { x: Int, y: Int -> x + y }
}

class MultiService(var url: String, var port: Int) {
    fun query(request: String): String = "Result for query '$request'"
}

data class Person(var name: String, var age: Int = 0, var city: String = "")

fun main(args: Array<String>) {

    val fish = Fish(5,10)

    println(fish.sum(4,5))  //normal way
    println(fish)

    Fish(5).let {      //scope function way
        println(it)
        println(it.sum(4,5))
        println(it)
    }
    fish.apply{
        println(this)
        println(sum(4,5))
    }

    fun writeToLog(message: String) {
        println("INFO: $message")
    }
    kotlin.random.Random.nextInt(10).also {
        writeToLog(it.toString())
    }

    val ans1 = fish.apply { sum(4,5) }
    val ans2 = fish.run { sum(4,5) }

    println(ans1)
    println(ans2)

    fish.sum(81,19).let { println(it)
    if (it<50) println("less than 50") else println("greater than or equal to 50")
    }

    val numbers = mutableListOf("one", "two", "three")
    val firstAndLast = with(numbers) {
        "The first element is ${first()}," +
                " the last element is ${last()}"
    }
    println(firstAndLast)
    with(fish)
    {
        println(sum(61,55))
    }

    val service = MultiService("abcdef",80)
    service.run {
        port = 1600
        println(query("$url to $port"))
    }
    val addition = fish.run { sum(55,45) }
    println(addition)

    val adam = Person("Adam").apply {
        age = 32
        city = "London"
    }
    println(adam)

    val number = mutableListOf("one", "two", "three").add("four").also { println("The list elements after adding new one: $it") }
    println(number)
    //numbers

}