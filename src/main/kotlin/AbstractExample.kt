
abstract class Polygon {

    abstract fun draw()

    fun square()
    {
        println("abcdefgh")
    }

    open val vertexCount: Int = 0

    abstract val vritant : Int

    interface AC{
        val ghi : Int
            get() = 5
    }
}

class Rectangle : Polygon(),ABC,BCD,Polygon.AC
 {

    override fun draw() {
        println("This is overriden abstract method of polygon class")
    }

    override val vertexCount = 4

    override val vritant = 10

    override fun asd() {
        super.asd()
    }


    /*override fun ghj(a: Int, b: Int): Int {
        return a+b
    }*/

    override val ghi: Int
        get() = super.ghi

    override fun ghj(a: Int, b: Int): Int {
        TODO("Not yet implemented")
    }

}

fun main(args: Array<String>) {
    val a = Rectangle().apply { draw()
    println(vertexCount)
    asd()
    //println(ghj(9,11))
    println(ghi)
    }

    val obj = object : Polygon()
    {
        override fun draw() {
            TODO("Not yet implemented")
        }

        override val vritant: Int
            get() = TODO("Not yet implemented")

    }

    val l = object : BCD{
        override fun ghj(a: Int, b: Int): Int {
            return a+b
        }

    }
    println( l.ghj(10,61))

    val b = BCD{a: Int, b: Int -> a+b }
    println(b.ghj(7,3))

    val i = object : ABC{
        override fun asd() {
            super.asd()
        }
    }

    i.asd()

}

interface ABC{
    fun asd()
    {
        println("interface")
    }
}

fun interface BCD{
    fun ghj(a:Int,b:Int) : Int

}