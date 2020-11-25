import kotlin.test.currentStackTrace

class EvenNumbersKtn {
}

fun main() {
    val myEvenNumbersKtn = arrayOf(5, 33, 64, 3, 2, 2, 5, 66, 5, 9, 11, 3, 2, 22, 5, 44)

//    var i = (myEvenNumbersKtn.size - 1)
//    var position = 0

    for (pass in 0 until (myEvenNumbersKtn.size - 1)) {
        for (currentPosition in 0 until (myEvenNumbersKtn.size - pass - 1)) {

            if (myEvenNumbersKtn[currentPosition] > myEvenNumbersKtn[currentPosition + 1]) {

                val temp = myEvenNumbersKtn[currentPosition]
                myEvenNumbersKtn[currentPosition] = myEvenNumbersKtn[currentPosition + 1]
                myEvenNumbersKtn[currentPosition + 1] = temp

            }
        }
    }

    println("Sorted numbers: [%s]".format(myEvenNumbersKtn.joinToString(separator = ", ")))

    println("Ahora desoues de habler organizado la lista encesito solo imprimir los numeros pares")


}

//if(myEvenNumbersKtn[currentPosition]% 2 == 0){
//    print("${myEvenNumbersKtn[currentPosition]}, ")
//}


//val myBubble = arrayOf(28, 18, 9, 67, 12, 43, 1, 23, 54)
//
//for (pass in 0 until (myBubble.size - 1)) {
//    for (currentPosition in 0 until (myBubble.size - pass - 1)) {
//        if (myBubble[currentPosition] > myBubble[currentPosition + 1]) {
//            val temp = myBubble[currentPosition]
//            myBubble[currentPosition] = myBubble[currentPosition + 1]
//            myBubble[currentPosition + 1] = temp
//        }
//
//    }
//}
//
//println("Sorted numbers: [%s]".format(myBubble.joinToString(separator = ", ")))
//}


//fun main() {
//    val myListLau = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
//
//    var i = myListLau.size - 1
//
//        while (i >= 0) {
//            if (myListLau[i]%2 == 0){
//                if (i > 1){
//                    print(myListLau[i].toString() + ", ")
//
//                } else {
//                    print(myListLau[i])
//
//                }
//
//            }
//            i--
//        }
//}