package com.example.solidprinciple


//Upper Level Module
class ProductCatalog {

    fun listAllProducts(){
        val sql : ProductRepo = SqlProductRepo()
        sql.getAllProduct().forEach{
            println(it)
        }
    }
}


//Interface between two module we can not directly call upper module or lower module each other,it's called Dependency Inversion Principle
interface ProductRepo{
    fun getAllProduct() : MutableList<String>
}


//Lower Level Module
class SqlProductRepo : ProductRepo{

   override fun getAllProduct():MutableList<String>{
        return mutableListOf("Jainil","Krunal")
    }
}

class MongoProductRepo : ProductRepo{
    override fun getAllProduct(): MutableList<String> {
        return mutableListOf("Mayani")
    }
}

fun main(){
    val productCatalog = ProductCatalog()
    productCatalog.listAllProducts()
}