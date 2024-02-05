package com.example.solidprinciple


interface IPrint{
    fun print()
    fun printSpoonDetails()
}

interface IScan{
    fun scan()
    fun scanPhoto()
}

interface IFax{
    fun fax()
    fun internetFax()
}

class CanonPrinter : IPrint,IScan{
    override fun print() {
        TODO("Not yet implemented")
    }

    override fun printSpoonDetails() {
        TODO("Not yet implemented")
    }

    override fun scan() {
        TODO("Not yet implemented")
    }

    override fun scanPhoto() {
        TODO("Not yet implemented")
    }

}