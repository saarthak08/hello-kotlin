import java.util.Scanner;

fun main() {
    var reader=Scanner(System.`in`);

    print("Enter a number: ");
    var x=reader.nextInt();

    println("The entered number: $x");

    print("Enter another number: ");
    var y=Integer.valueOf(readLine());
    println("The entered number: $y");

    println("Sum: ${sum(x,y)}")

    print("Enter any string: ");
    reader.nextLine();
    var m=reader.nextLine();
    println("String length: "+getStringLength(m));

}


fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        // `obj` is automatically cast to `String` in this branch
        return obj.length
    }

    // `obj` is still of type `Any` outside of the type-checked branch
    return null
}

//Function definitions in one line.
fun sum(a: Int, b: Int) = a + b



