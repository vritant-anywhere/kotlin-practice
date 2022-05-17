fun main(args: Array<String>) {
    var a = "vritant"
    println(a)
    a= "jain"
    println(a)
    val s = "vritant"
    println(s==a)
    println(s===a)
    a += " is A good person "
    println(a)
    println(a.uppercase()) // Create and print a new String object
    println(a)
    println(a.replace('a','b',true))
    a+=2
    println(a)
    val text = """for abc in numbers
        |print abc
    """.trimMargin()
    println(text)
    val price = """
        |${text} 9.99
    """.trimMargin()
    println(price)

    val d = arrayOf(1,2,3)
    for (i in d)
    {
        print("$i ")
    }
    print("\n")
    val g = Array(5){i-> i*i}
    g.forEach { print(it) }
}