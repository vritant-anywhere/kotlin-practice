
class Base{

    val age = 1

    class Nested{

        fun printMessage(message : String)
        {
            println(message)
        }

    }

    interface NestedInterface{
        fun printInterface()
        {
            println("This is a method of nested interface")
        }
    }
}

class Outer{

    private val age = 10
    fun printOuter()
    {
        println("This is an outer class")
    }

    inner class Inner{

        fun printInner()
        {
            println("This is an inner class which can access the members of outer as age is $age")
        }
    }
}
fun main() {

    //this is how we access
    Base.Nested().printMessage("Hello this is Nested Class")
    Base().age
    val nestedInterface = object : Base.NestedInterface{
        override fun printInterface() {
            super.printInterface()
        }
    }
    nestedInterface.printInterface()


    //inner class implementation
    Outer().printOuter()
    Outer().Inner().printInner()
}