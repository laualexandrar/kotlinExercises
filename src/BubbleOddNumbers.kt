class BubbleOddNumbers {

}

fun main() {

    val myBubbleOddNumbers = arrayOf(44, 9, 0, 88, 5, 78, 2, 8, 99, 0, 23, 65, 66, 99)

    var num = 0
    var i = myBubbleOddNumbers.size - 1

    while (num <= i) {
        if (myBubbleOddNumbers[num] % 2 != 0) {

            for (pass in 0 until (myBubbleOddNumbers.size - 1)) {
                for (position in 0 until (myBubbleOddNumbers.size - 1)) {
                    if (myBubbleOddNumbers[position] > myBubbleOddNumbers[position + 1]) {
                        val temp = myBubbleOddNumbers[position]
                        myBubbleOddNumbers[position] = myBubbleOddNumbers[position + 1]
                        myBubbleOddNumbers[position + 1] = temp
                    }
                }
            }
        }
        num++
    }

    println("Sorted odd numbers: [%s]".format(myBubbleOddNumbers.joinToString(separator = ", ")))
}