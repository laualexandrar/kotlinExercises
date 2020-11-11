class EvenNumbersKtn {
}

fun main() {
    val myListLau = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    var i = myListLau.size - 1

        while (i >= 0) {
            if (myListLau[i]%2 == 0){
                if (i > 1){
                    print(myListLau[i].toString() + ", ")

                } else {
                    print(myListLau[i])

                }

            }
            i--
        }
}