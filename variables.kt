import java.util.Scanner;

fun main() {

    // can be reassigned.
    var reader:Int = 2;
    //Type is inferred.
    var hello="Var Hello";

    //Final variable
    val x="Val hello";
    val k:String="Val k String";

    println("$reader $hello");

    println("$x\n$k")

   
    /*
    For a variable to hold null it must be explicitly specified as nullable.
    A variable can be specified as nullable by appending a ? to its type.
    We can access a nullable variable by using the ?. operator.
    We can use the ?: operator to specify an alternative value to use
    if a variable is null.
    */
    var fooNullable: String? = "abc"
    println(fooNullable?.length) // => 3
    println(fooNullable?.length ?: -1) // => 3
    fooNullable = null
    println(fooNullable?.length) // => null
    //Elvis Operator
    println(fooNullable?.length ?: -1) // => -1
    fooNullable="abc"

    val f:String=fooNullable!!;
    println("Now, String is not nullable. String: "+f);

    val nullableList: List<Int?> = listOf(1, 2, null, 4)
    val intList: List<Int> = nullableList.filterNotNull()
    println(intList);
}
