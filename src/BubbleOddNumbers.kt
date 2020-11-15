class BubbleOddNumbers {
}

fun main() {


    val myBubbleOddNumbers = arrayOf(2, 4, 6, 5, 7, 8, 79, 2, 11, 4, 34, 54, 32, 88, 76, 99, 45)

    for (pass in 0 until (myBubbleOddNumbers.size - 1)) {
        for (currentPosition in 0 until (myBubbleOddNumbers.size - pass - 1)) {
            if (myBubbleOddNumbers[currentPosition] > myBubbleOddNumbers[currentPosition + 1]) {
                val temp = myBubbleOddNumbers[currentPosition]
                myBubbleOddNumbers[currentPosition] = myBubbleOddNumbers[currentPosition + 1]
                myBubbleOddNumbers[currentPosition + 1] = temp
            }
        }
    }

    println("Sorted numbers: [%s]".format(myBubbleOddNumbers.joinToString(separator = ", ")))

}