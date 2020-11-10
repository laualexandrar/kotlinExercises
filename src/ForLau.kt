class ForLau {
}

fun main() {
    val myForLau = arrayOf(1, 5, 1, 2, 4, 5, 7, 31, 1)
    val myListLau = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    println(" Here, I am going to print the odd numbers")

    for (num in myForLau) {

        if (num % 2 != 0) {
            println(num)
        }
    }
    println("now I am going to print the even numbers")

    for (num in myForLau) {

        if (num % 2 == 0) {
            print(" $num ")
        }
    }
}