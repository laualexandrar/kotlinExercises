class IceCream (var flavor: String , var color: String, var price: Float, var hasChocolate : Boolean  ){

}

fun main(){
    val myIcecream = IceCream("Cherry", "Pink", 2.5F, false)

    println("yesterday I bougth a ${myIcecream.flavor} " +
            "ice cream with an interesting ${myIcecream.color} color and it was very cheap just ${myIcecream.price} dollars " +
            "when I ask if it has chocolate they said ${myIcecream.hasChocolate}" )

    if (myIcecream.hasChocolate == true){
        println("It has chocolate!")
    }else {
        println("It doesn't have chocolate")
    }

    var iceCreamFlavors = arrayOf(IceCream("Chocolate", "brown", 3.0F, true),
        IceCream("mint", "blue", 3.0F, false), IceCream("Mango", "orange", 3.0F, true),
                IceCream("cookies and cream", "white", 3.0F, true))


   println(iceCreamFlavors.size)


    var num = arrayOf(3,6,8,67,99)

    println(num[0])

}
