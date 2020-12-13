import java.util.Scanner;

fun main() {
    val reader=Scanner(System.`in`);
    print("Enter a string: ");
    var x:String=reader.nextLine();
    println("Length of the input string: " +getStringLength(x));
    println(sums(10,20,30));
    println(difference(10,20));   
    println(variableArgsSum(10,20,30,"hello","world")); 

    //Kotlin functions are first-class, which means that they can be stored in variables and data structures, passed as arguments to and returned from other higher-order functions. 
    //You can operate with functions in any way that is possible for other non-function values.
    higherOrderFunction(hello);

    var abc=listOf(1,2,3,4);
    abc.fold(0,{total,item->item*total});
    println(abc(420));
}


fun getStringLength(str:String=""):Int {
    return str.length;
}

fun sums(a:Int,b:Int,c:Int=0):Int =  a+b+c;

fun difference(a:Int,b:Int) = a-b ;

//Variable Arguments in Function
fun variableArgsSum(vararg names:Any)=names.size;


//Lambda Function
var hello = { ->
    println("Hello Lambda function!");
}

var abc:(m:Int) -> Int = { 
    x:Int -> x
}

//Higher Order Function
fun higherOrderFunction(h:()->Unit) {
    val x=fun() {
        println("Anonymous Function");
    }

    x();

    println("Higher Order Function");
    h();
}

