
open class vritant{

     open val jain = 5

    val jkij = 10

    companion object{

        private var instance: vritant? = null
        private var a = 1

        fun getInstance(): vritant
        {
                /*println(a)
                a++*/
                if (instance == null) {
                    println(a)
                    a++
                    instance = vritant()
                }

                return instance as vritant
        }
        fun yui(){
            println("yui method")

        }

        private var kj=5

    }

    open fun ll()
    {
        println(kj)
    }
}

val friday = object{

    val yt = "ab"
    override fun toString() = yt
}

val ab = object : vritant(){

    override val jain: Int
        get() = 9

    override fun ll() {
        super.ll()
    }
}

object yu{
    fun ii()
    {

    }
}


fun main(args: Array<String>) {

    println(friday)
    println(ab.jain)

    ab.ll()

    yu.ii()

    val instance = vritant.getInstance()
    vritant.yui()
    val instance2 = vritant.getInstance()
    vritant.getInstance().jkij
    vritant.getInstance().jain

}