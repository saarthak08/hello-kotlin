import java.util.Scanner;

fun main() {
    var reader=Scanner(System.`in`);

    println("Enter a number: ");
    var x=reader.nextInt();

    println("The entered number: $x");

    println("Enter another number: ");
    var y=Integer.valueOf(readLine());
    println("The entered number: $y");

    println("Sum: ${sum(x,y)}")
}


fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        // `obj` is automatically cast to `String` in this branch
        return obj.length
    }

    // `obj` is still of type `Any` outside of the type-checked branch
    return null
}

fun sum(a: Int, b: Int) = a + b



