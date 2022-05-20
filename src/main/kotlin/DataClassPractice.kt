data class User(val name: String,val age: Int)

data class Human(val name : String = "",val age: Int = 0)

data class People(var name: String)
{
    var age : Int = 0
}

fun main() {
    val john = User("John",20)
    println(john)

    //destructuring declaration
    val (name,age) = john
    println(name)
    println(age)

    //it is similar as
    val name2 = john.component1()
    val age2 = john.component2()
    println(name2)
    println(age2)

    // we can use destructuring like this also
    val userList = listOf(User("Abhishek",50),john,User("Vritant",21))
    for ((a,b) in userList)
    {
        print("$a  $b")
        println()
    }

    //The componentN() functions are not called for the components that are skipped in this way.
    val (_,age3) = john
    println(age3)


    //if we don't specify any parameter for the data class constructor
    val (name5,age5) = Human()
    print("$name5 and age is $age5")
    println()

    val people1 = People("Vritant")
    val people2 = People("Vritant")
    people1.age = 5
    println(people1==people2)


    //copy function implementation
    val vritant = User("Vritant",21)
    val rahul = vritant.copy(name = "Rahul")

    println(vritant)
    println(rahul)





}
