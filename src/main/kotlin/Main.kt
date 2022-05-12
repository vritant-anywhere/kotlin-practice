fun main(args: Array<String>) {

    val myAquarium = Aquarium()

    //println(myAquarium.height)
    //println(myAquarium.width)
    myAquarium.length=30
    //println(myAquarium.length)

    val aquarium =Aquarium(10)
    //println(aquarium.volume)

    val towerTank = TowerTank()

    println(towerTank.volume)

    towerTank.volume = 40

    println(towerTank.volume)

    println(towerTank.hashCode())
}