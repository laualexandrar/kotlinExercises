class Bubble {

}

fun main() {

    val myBubble = arrayOf(28, 18, 9, 67, 12, 43, 1, 23, 54)

    for (pass in 0 until (myBubble.size - 1)) {
        for (currentPosition in 0 until (myBubble.size - pass - 1)) {
            if (myBubble[currentPosition] > myBubble[currentPosition + 1]) {
                val temp = myBubble[currentPosition]
                myBubble[currentPosition] = myBubble[currentPosition + 1]
                myBubble[currentPosition + 1] = temp
            }

        }
    }

    println("Sorted numbers: [%s]".format(myBubble.joinToString(separator = ", ")))
}


//var temp = myBubble[i]
//
//if (temp <= myBubble[i+1]) {
//
//}
//i = i++


//   myBubble[temp]

///myBubble[i]


//
//fun main() {
//
//    val myBubble = arrayOf(28, 18, 9)
//    var i = 1
//
//    // val myBubble = arrayOf(28, 18, 9, 67, 12, 43, 1, 23, 54)
//
//    for (number in myBubble) {
//
//        val temp = myBubble[i]
//
//        if (i <= (myBubble.size - 1)) {
//
//            if (number >= temp) {
//                println(temp)
//            } else {
//                println(number)
//            }
//            i = i++
//        }
//    }
//
//}


//last try
//val myBubble = arrayOf(28, 18, 9)
//var i = 1
//
//for(number in myBubble) {
//
//    if (number > myBubble[i]) {
//
//        val temp = myBubble[0]
//        myBubble[0] = myBubble[1]
//        myBubble[1] = temp
//
//        println(myBubble[i])
//    } else {
//        println(number)
//    }
//}
//}