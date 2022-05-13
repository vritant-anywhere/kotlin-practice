open class Polymorphism {

    fun overLoad()
    {
        println("This is method 1 of overloading")
    }

    fun overLoad(a:Int,b:Int) : Int
    {
        return a+b.also { println("This is method 2 of overloading")}
    }

    open fun multiply(c:Int,d:Int) : Int{
        return c*d.also { println("This is overriding method 1") }
    }
}

class MethodOverriding : Polymorphism()
{
    override fun multiply(c: Int, d: Int): Int {
        return c/d.also { println("This is overriding method 2") }
    }
}

fun main(args: Array<String>){

    Polymorphism().apply {
        overLoad()
        overLoad(4,5)
        multiply(10,2)
    }

    MethodOverriding().multiply(10,2)
}