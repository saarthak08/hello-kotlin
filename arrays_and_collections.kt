fun main() {
    // Arrays
    val arr: IntArray = IntArray(5)
    val arr4 = Array<Int>(5) { 0 }
    val arr2 = intArrayOf(12, 23, 45)
    val arr3 = arrayOf<Int>(12, 24, 54)

    val arr5 = arrayOf<String>("23", "54")
    val arr6 = Array<String>(5) { "" }

    arr3.forEach { e ->
        println(e)
     }
    arr5.forEachIndexed { i, item ->
        println("$i " + item)
    }
    for (x in arr2) {
        println(x)
    }

    for (i in 0..arr2.size - 1) {
        println(arr2[i])
    }

    // Lists are immutable while arrays are mutable. 
    // Both array & list have fixed size.
    // Lists can store variable type data but arrays can't.
    val varList = listOf(1, 2, "245")
    val x = List<Int>(5) { 0 }
    println(varList)

    val varMap = mapOf(23 to 43, "23" to 34)
    val varSet = setOf(23, 35)

    var mutableMap = mutableMapOf<Int, Int>()
    var mutableList = mutableListOf<Any>()
    var mutableSet = mutableSetOf<Any>()
    println(varMap.keys)

     // Kotlin provides higher-order functions for working with collections.
     val z = (1..9).map { it * 3 }
     .filter { it < 20 }
     .groupBy { it % 2 == 0 }
     .mapKeys { if (it.key) "even" else "odd" }
    println(z) // => {odd=[3, 9, 15], even=[6, 12, 18]}


    /*
    Sequence performs all the processing steps one-by-one for every single element. 
    In turn, Iterable completes each step for the whole collection and then proceeds to the next step.
     */
    val words = "The quick brown fox jumps over the lazy dog".split(" ")
    // convert the List to a Sequence
    val wordsSequence = words.asSequence()

    val lengthsSequence = wordsSequence.filter { println("filter: $it"); it.length > 3 }
    .map { println("length: ${it.length}"); it.length }
    .take(4)

    println("Lengths of first 4 words longer than 3 chars")
    // terminal operation: obtaining the result as a List
    println(lengthsSequence.toList())
}
