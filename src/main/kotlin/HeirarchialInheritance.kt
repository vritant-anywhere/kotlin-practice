private open class FatherC{
    fun fatherIdentity(){
        println("I am a Father.")
    }
    open fun ajgh()
    {
        println("father")
    }
}
private class SonC: FatherC(){
    fun sonIdentity(){
        println("I am a Son.")
    }
}
private class Daughter: FatherC(){
    fun daughterIdentity(){
        println("I am a Daughter.")
    }

    override fun ajgh() {
        println("daughter")
    }
}
fun main(args: Array<String>) {
    val s = SonC()
    s.fatherIdentity()
    s.sonIdentity()
    val d = Daughter()
    d.fatherIdentity()
    d.daughterIdentity()
    val f : FatherC = Daughter()
    f.ajgh()
}