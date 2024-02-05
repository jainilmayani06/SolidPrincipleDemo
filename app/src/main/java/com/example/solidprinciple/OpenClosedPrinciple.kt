package com.example.solidprinciple


interface Customer{
    fun isLoyalCustomer() : Boolean{
        return true
    }
}

class VehicleInsuranceCustomer : Customer{
    override fun isLoyalCustomer() : Boolean{
        return true
    }
}

class HomeInsuranceCustomer : Customer{
   override fun isLoyalCustomer() : Boolean{
        return true
    }
}

class LifeInsuranceCustomer : Customer{
    override fun isLoyalCustomer() : Boolean{
        return true
    }
}

class InsuranceCompany{

    fun discountRate(customer: Customer):Int{
        return if (customer.isLoyalCustomer()) 38 else 20
    }


}

fun main(){
    val lifeInsuranceCustomer = LifeInsuranceCustomer()
    val homeInsuranceCustomer = HomeInsuranceCustomer()
    val vehicleInsuranceCustomer = VehicleInsuranceCustomer()

    val insuranceCompany = InsuranceCompany()

    insuranceCompany.discountRate(lifeInsuranceCustomer)
    insuranceCompany.discountRate(homeInsuranceCustomer)
    insuranceCompany.discountRate(vehicleInsuranceCustomer)

}