private open  class Father{
     fun fatherIdentity(){
        println("I am a Father.")
    }

}
 private class Son: Father(){

     fun sonIdentity(){
        println("I am a Son.")
    }

 }
fun main(args: Array<String>) {
    val s = Son()
    s.fatherIdentity()
    s.sonIdentity()
}

