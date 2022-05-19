
fun main() {

    val a = 10
    val result = try{
        a/0
    }catch (e : ArithmeticException)
    {
        println(e)
        println("You are doing wrong something")
        a/1
    }
    finally {
        println("Finally block executed ")
    }
    println(result)


    val b : String? = "Vritant"
    val res = b ?: throw Exception("Result is required")
    println(res)
    println("Hello is printed")

}