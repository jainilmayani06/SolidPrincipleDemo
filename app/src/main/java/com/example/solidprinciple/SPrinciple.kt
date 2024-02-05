package com.example.solidprinciple

class Square {

    fun calculateArea(side:Int) : Int{
        return side*side
    }

    fun calculateParameter(side: Int) : Int{
        return  4*side
    }


    //This is Ui part methods so we have to create another class for UI,we can not put into this class for SPrinciple functionality
    /*fun renderSquare(){
        print("Render Square")
    }

    fun renderLargeSquare(){
        print("Render Large Square")
    }*/
}

class SquareUi(){

    fun renderSquare(){
        print("Render Square")
    }

    fun renderLargeSquare(){
        print("Render Large Square")
    }

}