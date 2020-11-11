import kotlin.test.currentStackTrace

class BubbleRightToLeft {

}

fun main() {

    val myBubbleRightToLeft = arrayOf(78, 23, 64, 9, 2, 54, 2)

    for (pass in 0 until (myBubbleRightToLeft.size - 1)) {
        for (currentposition in 0 until (myBubbleRightToLeft.size - 1)) {
            if (myBubbleRightToLeft[currentposition] < myBubbleRightToLeft[currentposition + 1]) {
                val temp = myBubbleRightToLeft[currentposition]
                myBubbleRightToLeft[currentposition] = myBubbleRightToLeft[currentposition + 1]
                myBubbleRightToLeft[currentposition + 1] = temp
            }
        }
    }
    println("Sorted numbers: [%s]".format(myBubbleRightToLeft.joinToString(separator = ", ")))
}
