
//Generic Class
class Box<T>(t:T) {
    
    var value=t;

    fun print():Unit {
        println(value);
    }
}

fun main() {
    var x=Box<Int>(2);
    x.print();
    var k=Box<String>("Hello");
    k.print();
    val p=123;
    println(p.addToString(34));
    val m = "hello";
    println(m.addToString("world"));
}

//Generic Function
fun <T> T.addToString(t:T) :String {
    return t.toString()+ " "+this.toString();
}


//Source objects can be type casted to any Super Class but not to any subclass.
interface Source<out T> {
    fun nextT(): T
}

fun demo(strs: Source<String>) {
    val objects: Source<Any> = strs // This is OK, since T is an out-parameter
    // ...
}

//Source objects can be typ casted to any subclass but not to any superclass.
interface Comparable<in T> {
    operator fun compareTo(other: T): Int
}

fun demo(x: Comparable<Number>) {
    x.compareTo(1.0) // 1.0 has type Double, which is a subtype of Number
    // Thus, we can assign x to a variable of type Comparable<Double>
    val y: Comparable<Double> = x // OK!
}