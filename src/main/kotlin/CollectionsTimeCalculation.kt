import java.util.*

fun main() {
    val arrayList = ArrayList<Int>()

    val startTime = System.nanoTime()
    arrayList.add(1)
    arrayList.add(2)
    arrayList.add(3)
    arrayList.add(4)
    arrayList.add(5)
    arrayList.add(6)
    arrayList.add(7)
    arrayList.add(8)
    arrayList.add(9)
    arrayList.add(10)
    arrayList.add(5)
    val endTime = System.nanoTime()

    println("Execution time of adding element in array list is ${(endTime-startTime)/1000} microseconds")


    val linkedList = LinkedList<Int>()

    val stTime = System.nanoTime()
    linkedList.add(1)
    linkedList.add(2)
    linkedList.add(3)
    linkedList.add(4)
    linkedList.add(5)
    linkedList.add(6)
    linkedList.add(7)
    linkedList.add(8)
    linkedList.add(9)
    linkedList.add(10)
    linkedList.add(5)
    val enTime = System.nanoTime()

    println("Execution time of adding element in linkedList is ${(enTime-stTime)/1000} microseconds")

    val set = HashSet<Int>()
    set.add(4)
    val setStartTime = System.nanoTime()
    set.add(4)
    val setEndTime = System.nanoTime()
    println("Execution time of adding element in set is ${(setEndTime-setStartTime)/1000} microseconds")
    set.add(5)


    //removing time

    val alStartTime = System.nanoTime()
    arrayList.removeAt(5)
    val alEndTime = System.nanoTime()

    //seconds conversion

    val elapsedTimeInSecond = (alEndTime- alStartTime).toDouble() / 1000000000
    println("$elapsedTimeInSecond seconds")


    println("Execution time of removing element in array list is ${(alEndTime-alStartTime)/1000} microseconds")

    val llStartTime = System.nanoTime()
    linkedList.removeAt(5)
    val llEndTime = System.nanoTime()
    println("Execution time of removing element in linkedList is ${(llEndTime-llStartTime)/1000} microseconds")


    val setStartTime2 = System.nanoTime()
    set.remove(4)
    val setEndTime2 = System.nanoTime()
    println("Execution time of removing element in set is ${(setEndTime2-setStartTime2)/1000} microseconds")

}