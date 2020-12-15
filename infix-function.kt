/*
Infix notation

Functions marked with the infix keyword can also be called using the infix notation (omitting the dot and the parentheses for the call). 

Infix functions must satisfy the following requirements:
    They must be member functions or extension functions;
    They must have a single parameter;
    The parameter must not accept variable number of arguments and must have no default value.
 
 1 shl 2 + 3 is equivalent to 1 shl (2 + 3)
 
   */

//Extension Function to Int Class. 
//Extension Functions are basically static in nature.  
infix fun Int.add (a:Int): Int {
    return this+a;
}


fun main(args:Array<String>) {
    println(1 add 3);
    println(1.add(3));
} 