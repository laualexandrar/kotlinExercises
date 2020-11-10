class PracticingKotlin{



}

fun main() {
    var daysOfWeek = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")

    for (day in daysOfWeek) {
        println(day)
    }

    for ((index, day) in daysOfWeek.withIndex()) {
        println("$index : $day")
    }

    daysOfWeek.forEach {
        println(it)
    }

    var teclado: String? = null //el String con el ? indica que acepta valores nulos
    var longTeclado: Int? = teclado?.length
        ?: 0 /*El operador ELVIS sirve para devolver un valor cuando nuestro dato introducido sea null, evitando el NULL POINTER EXCEPTION*/
    println("longitud del dato: $longTeclado")

    val listWithNulls: List<Int?> = listOf<Int?>(
        1,
        null,
        null,
        4
    ) /*Creamos una lista con valores nulos e instanciamos que la lista pueda tomar valores nulos*/
    println("Lista con nulos: $listWithNulls") /*Imprimimos la lista que contiene valores nulos*/

    val listWithoutNulls: List<Int?> =
        listWithNulls.filterNotNull() // aqui filtraremos los datos que sean nulos, este tipo de codigo nos sirve cuando traemos datos de internet y hay espacios vacios en la informacion.
    println("Lista sin nulos: $listWithoutNulls")

    val numeritos = intArrayOf(6, 6, 23, 9, 2, 3, 2)

    for (numero in numeritos) {
        println("Numero : $numero")
    }

    for ((index2, numero) in numeritos.withIndex()) {
        println("este es el index $index2 del numero $numero")
    }

    //organizar los numeros

   var sum = 0

    for (numArray in numeritos){
        sum += numArray
     }
        val average = sum / numeritos.size

            println("Promedio = $average")

    var h =12
    var g = 34

    print (if(h > g) "h is > than g" else "g is greater than h")

}

    //sumar los numeros dentro del array

    //promediar los numeros dentro del array

