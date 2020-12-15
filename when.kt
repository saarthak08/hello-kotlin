fun main() {
     // "when" can be used as an alternative to "if-else if" chains.
     val i = 10
    val fooString="234";
     when {
         i < 7 -> println("first block")
         fooString.startsWith("hello") -> println("second block")
         else -> println("else block")
     }
 
     // "when" can be used with an argument.
     when (i) {
         0, 21 -> println("0 or 21")
         in 1..20 -> println("in the range 1 to 20")
         else -> println("none of the above")
     }
 
     // "when" can be used as a function that returns a value.
     var result = when (i) {
         0, 21 -> "0 or 21"
         in 1..20 -> "in the range 1 to 20"
         else -> "none of the above"
     }
     println(result)
}