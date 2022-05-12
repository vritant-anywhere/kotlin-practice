
open class vritant{
     open val jain = 5
}

val friday = object{

    val yt = "ab"
    override fun toString() = yt
}

val ab = object : vritant(){

    override val jain: Int
        get() = 9

}

fun main(args: Array<String>) {

    println(friday)
    println(ab.jain)
}