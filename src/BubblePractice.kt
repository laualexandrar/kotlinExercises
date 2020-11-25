class BubblePractice {

}

fun main() {
    val myBubble = arrayOf(3, 5, 2, 43, 6, 87, 1, 3, 5, 77)

    for (pass in 0 until (myBubble.size - 1)) {
        for (currentLocation in 0 until (myBubble.size - pass - 1)) {

            if (myBubble[currentLocation] > myBubble[currentLocation + 1]){
            val temp = myBubble[currentLocation]
            myBubble[currentLocation] = myBubble[currentLocation + 1]
            myBubble[currentLocation + 1] = temp
            }
        }
    }
    println("Sort numbers[%s]:".format(myBubble.joinToString(separator = " ")))

}