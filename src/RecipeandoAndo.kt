class recipeandoAndo {
}

fun main() {

    var number: String?

    println("Welcome to recipeandoAndo")

    val intro = """
        Here you are going to find many delicious recipes around the world, select one of these options!
        
        1. Create recipe
        2. Make recipe
        3. Exit
    """.trimIndent()

    println(intro)


    do {
        number = readLine()

        when (number) {
            "1" -> println("Welcome! we are going to create a new recipe!")
            "2" -> println("Are we going to make a new recipe? Let's go!")
            "3" -> println("Exit")
            else -> println("Please select a number between 1 to 3")
        }
    } while (number != "3")
}