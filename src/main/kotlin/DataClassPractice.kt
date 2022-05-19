data class User(val name: String,val age: Int)

fun main() {
    val user = User("John",20)
    println(user)

    val (name,age) = user
    println(name)
    println(age)

    println( user.component1())

}
