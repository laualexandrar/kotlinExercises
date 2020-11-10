class miniProject1 (val type: String, val name: String){

}

fun main() {
    val myMiniproject1 = arrayOf(miniProject1 ("Store", "MyShoeStore"), miniProject1("store","groceryStore"))

    println(myMiniproject1[0].type)

    val project = miniProject1 ("Store", "MyShoeStore")
    project.name
    project.type

    println("My project is the type ${project.type}, and its name is ${project.name}")

}