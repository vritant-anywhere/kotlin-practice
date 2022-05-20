import java.util.LinkedList
import java.util.Stack
import java.util.Vector

fun printAll(strings: Collection<String?>) {
    for(s in strings) print("$s ")
    println()
}

 fun printAll(elements : Collection<Int>) : Boolean
{
    for(ele in elements) print("$ele ")
    println()

    return true
}

fun main(args: Array<String>) {

    val set = setOf('a','b','c','d','a')
    for (ele in set)
    {
        print("$ele ")
    }
    println()

    val s2 = mutableSetOf('a','b','c','d')
    s2.add('e')
    println()
    for (ele in s2)
    {
        print("$ele ")
    }

    val stringList = listOf("one", "two", "one")
    printAll(stringList)

    val stringSet = setOf("one", "two", "three")
    printAll(stringSet)

    val numbers = listOf("one", "two", "three", "four",null)
    printAll(numbers)


    val bob = Person("Bob", 31)
    val people = listOf(Person("Adam", 20), bob, bob)
    val people2 = listOf(Person("Adam", 20), Person("Bob",31), bob)
    println(people == people2)
    bob.age = 32
    println(people == people2)

    val num = mutableListOf<String>()
    num.add("zero")
    num.add("one")
    num.add(2,"two")
    printAll(num)

    num.removeLast()
    num.add(1,"two")
    printAll(num)

    val numberBackwards = mutableSetOf(4,3,2,1)
    numberBackwards.add(5)

    printAll(numberBackwards)

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
    val anotherMap = mapOf("key2" to 2, "key1" to 1, "key4" to 1, "key3" to 3)

    println("The maps are equal: ${numbersMap == anotherMap}")

    val map = buildMap{ put('a',1)
        put('b',2)
        put('c',3)
    }
    val set2 = buildSet{add('a')
    add('b')
    add('c')
    add('c')}

    println(map)
    println(set2)

    val empty =  emptyList<Int>()

    val list2 = MutableList(3) { it+1 }
    printAll(list2)

    val linkList = LinkedList<Int>()
    linkList.add(1)
    linkList.add(2)
    linkList.add(3)
    linkList.addAll(listOf(4,5,6))
    printAll(linkList)
    linkList.remove(5)
    printAll(linkList)

    val alice = Person("Alice")
    val sourceList = mutableListOf(alice, Person("Bob"))
    val copyList = sourceList.toList()
    sourceList.add(Person("Charles"))
    alice.name = "Alicia"
    println("First item's name is: ${sourceList[0].name} in source and ${copyList[0].name} in copy")
    println("List size is: ${sourceList.size} in source and ${copyList.size} in copy")

    val copySet = mutableSetOf(1,2,3,4,5,6)
    val copyList2 = copySet.toMutableList()
    printAll(copyList2)
    copySet.remove(4)
    printAll(copyList2)
    printAll(copySet)

    val referenceList = copyList2
    referenceList.add(5)
    printAll(copyList2)
    printAll(referenceList)

    val itr = referenceList.iterator()

    while(itr.hasNext())
    {
        println(itr.next())
    }

    referenceList.forEach{
        print("$it ")
    }
    println()

    val listIterator= referenceList.listIterator(referenceList.size)
    while (listIterator.hasPrevious())
    {
        print("${listIterator.previousIndex()} ${listIterator.previous()} ".trim())
        println()
    }

    val arrayList = ArrayList<MutableSet<Int>>()
    arrayList.add(copySet)
    arrayList.add(list2.toMutableSet())

    for (i in arrayList)
    {
        printAll(i)
    }

    val setOfArrayList = setOf(arrayList)
    println(setOfArrayList)

    val setOfMap = setOf(numbersMap,map)
    println(setOfMap)

    val map2 : MutableMap<Char,Int> = mutableMapOf()
    println( map2.put('a',4))
    println(map2.put('b',2))
    println(map2.put('a',3))
    println(map2['a'])
    map2.put('z',26)
    println( map2.put('g',26).hashCode())

    map2['a']?.let { println(it.equals(map2.put('a',5))) }


}