import kotlin.test.currentStackTrace

class BubbleRightToLeft {

}

fun main() {
    val myBubbleRightToLeft = arrayOf(28, 18, 9, 67, 12, 43, 1, 23, 54)

    for (pass in 0 until (myBubbleRightToLeft.size - 1)) {

        for (currentPosition in 0 until (myBubbleRightToLeft.size - 1)) {

            if (myBubbleRightToLeft[currentPosition] < myBubbleRightToLeft[currentPosition + 1]) {

                val temp = myBubbleRightToLeft[currentPosition]
                myBubbleRightToLeft[currentPosition] = myBubbleRightToLeft[currentPosition + 1]
                myBubbleRightToLeft[currentPosition + 1] = temp
            }


        }
    }
    println("Sorted numbers: [%s]".format(myBubbleRightToLeft.joinToString(separator = ", ")))

}