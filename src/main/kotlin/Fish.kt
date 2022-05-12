class Fish(friendly : Boolean = true, volumeNeeded:Int) {

    constructor(a:Int) : this(volumeNeeded = 5)
    {
        println("constructor $a")
    }

    constructor(b:Int,c:Int) : this(volumeNeeded = 5)
    {
        val fish = Fish(5)
        println("2nd const $fish")

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


fun main(args: Array<String>) {

    val fish = Fish(5,10)

    /*Fish(5).let {
        println(it)
        println(it.sum(4,5))
        println(it)
    }*/
}