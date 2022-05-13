private open  class Father{
    fun fatherIdentity(){
        println("I am a Father.")
    }

}
 private class Son: Father(){

     var f = Father().fatherIdentity()
    fun sonIdentity(){
        println("I am a Son.")
    }
}
fun main(args: Array<String>) {
    val s = Son()
    s.fatherIdentity()
    s.sonIdentity()
}

