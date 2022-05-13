class Rty(var q:Int=10,var w : Boolean) {

    constructor(a:Int,b:Int) : this(w=false) {
        println("$a,$b")
        jj()
    }

    fun jj()
    {
        println(w)
    }

    constructor(c:Int) : this(4,5)
    {
        //val r = Rty(4,5)
        println(c)
    }
}

fun main(args: Array<String>) {
    Rty(4)
}