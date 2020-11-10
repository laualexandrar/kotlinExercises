import java.util.*

/**
 * Exercises.
 *
 * 0. Draw a square (filled)
 * 1. Draw a rectangle 40x5 using * (asterisk)
 * 1.5 Draw an empty square, just the sides.
 * 2. Draw the same rectangle but empty, just the sides.
 * 3. Create a method that allows to draw a rectangle with custom width and height (Filled rectangle not empty)
 * 4. Draw a triangle.
 */

fun main() {

    var limit = 4

    for (i in 1..limit) {
        for (j in 1..limit) {
            print("* ")
        }
        println()
    }
    println("Now the rectangle")

    for (i in 1..5) {
        for (j in 1..40) {
            print("*")
        }
        println()
    }

    println(" Now the empty square")


    for (i in 1..limit) {

        for (j in 1..limit) {
            if (i == 1 || i == limit) {

                print("* ")
            } else {
                if (j == 1 || j == limit) {
                    print("* ")
                } else {
                    print("  ")
                }
            }
        }
        println()
    }

    println("Now the empty rectangle")

    for (i in 1..5) {
        for (j in 1..40) {
            if (i == 1 || i == 5) {
                print("* ")
            } else {
                if (j == 1 || j == 40) {
                    print("* ")
                } else {
                    print("  ")
                }
            }
        }
        println()
    }

    println("Now I am going to draw a triangle")

    for (i in 1..3) {

        for (j in 1..5) {
            if (i == 1 && j != 3) {
                print("  ")
            } else if (i == 1 && j == 3){
                print("* ")
            }
            if (i == 2 && j == 1 ){
                print("  ")
            } else if (i == 2 && j== 2){
                print("* ")
            }else if(i == 2 && j==3){
                print("  ")
            } else if(i == 2 && j==4){
                print("* ")
            } else if (i ==2 && j == 5){
                print("  ")
            }
            if (i == 3) {
                print("* ")
            }
        }

        println()
    }

    println("Now Create a method that allows to draw a rectangle with custom width and height (Filled rectangle not empty")

    val height = Scanner(System.`in`)
    print("Enter height: ")
    var enteredheight: Int = height.nextInt()
    println("You entered: $enteredheight")

    val width = Scanner(System.`in`)
    print("Enter width: ")
    var enteredwidth: Int = height.nextInt()
    println("You entered: $enteredwidth")


    for (i in 1..enteredheight) {
        for (j in 1..enteredwidth) {
            print("* ")
        }
        println()
    }



}

//Exercises
// 1. How to use when in Kotlin

//var x = 3
//
//when (x){
//    in 1..2 -> println("esta entre 1 y 2")
//    in 1..5 -> println("esta entre 1 y 5")
//    in 1..3 -> print("esta entre 1 y 3")
//}
//
//for (y in 11..17) {
//    println(y)
//}
//
//if (x < 4){
//    println( "$x es menor que 4")
//}