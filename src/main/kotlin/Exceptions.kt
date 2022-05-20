
fun main() {

    val a = 10
    val result = try{
        a/0
    }catch (e : ArithmeticException)
    {
        println(e)
        println("You are doing wrong something")
    }
    finally {
        println("Finally block executed ")
    }
    println(result)


    val b : String? = null
    val res = b ?: throw Exception("Result is required")

    println(res)
    println("Hello is printed")


}