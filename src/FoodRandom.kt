class FoodRandom {
}

fun main() {

    val myFillingRandom = arrayOf("chicken", "beef", "cheese", "hawaiian")
    val myFavoriteFood = arrayOf("Empanadas", "Lasagna", "Pasta", "Arepas", "sandwich")
    val mySauces = arrayOf("mustard", "mayo", "ketchup")

    myFillingRandom.size
    myFavoriteFood.size
    mySauces.size

    val foodRandom1 = (Math.random() * myFavoriteFood.size).toInt()
    val fillingRandom = (Math.random() * myFillingRandom.size).toInt()
    val saucesRandom = (Math.random() * mySauces.size).toInt()

    println("${myFavoriteFood[foodRandom1]}, ${myFillingRandom [fillingRandom]}, ${mySauces[saucesRandom]}")

    myFillingRandom[2] = "tuna" // I can change the values inside a val array but it is going to points to the same array forever

    for (filling in myFillingRandom){
        println(filling)
    }

}