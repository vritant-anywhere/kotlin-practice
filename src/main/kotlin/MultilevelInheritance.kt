open class FatherB{
    fun fatherIdentity(){
        println("I am a Father.")
    }
}
open class SonB: FatherB(){

    fun sonIdentity(){
        println("I am a Son.")
    }
}
 class GrandSon: SonB(){
    fun grandsonIdentity(){
        println("I am a GrandSon.")
    }
}

fun main(args: Array<String>) {

    val g = GrandSon()
    g.fatherIdentity()
    g.sonIdentity()
    g.grandsonIdentity()
}
