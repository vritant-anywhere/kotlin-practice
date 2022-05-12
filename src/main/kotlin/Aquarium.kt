
open class Aquarium(var h: Int=10, var l : Int=200, var b : Int =50) {


    var length = 20
    var width = 10
    var height = h

    var volume
      get() = length*width*height  //defined a getter for the variable volume i.e. override its default getter
      set(value) { length=value}

    constructor(noOfFish : Int) : this(){
        length = noOfFish*20
    }
}

class TowerTank() : Aquarium()
{
    /*override var volume: Int
    get() = (length*width*height*3.14).toInt()
    set(value) {length=value}*/
}

