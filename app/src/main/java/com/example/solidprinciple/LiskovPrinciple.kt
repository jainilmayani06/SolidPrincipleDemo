package com.example.solidprinciple


open class Vehicle{
    open fun getInteriorWidth() : Int{
        return 0
    }
}

 class Car : Vehicle(){

     override fun getInteriorWidth(): Int {
        return this.getCabinWidth()
     }

    fun getCabinWidth():Int{
        return 35
    }
}

class RacingCar:Vehicle(){

    override fun getInteriorWidth(): Int {
        return this.cockpitWidth()
    }

    fun cockpitWidth():Int{
        return 15
    }

}

fun main(){

    val list = mutableListOf(RacingCar(),Car())

    list.forEach{
        println(it.getInteriorWidth())
    }
}