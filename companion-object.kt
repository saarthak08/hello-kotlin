class MyClass {
    companion object { 
        //In Java, this will be accessed like this: MyClass.Companion.print().
        fun print() {
            println("Hello World!");
        }
    }
}

class MyClass2 {   
    companion object Comp {
        @JvmStatic //Now in Java, this function can directly be accessed like MyClass2.print();
        fun print() {
            println("Hello World! 2");
        }
    }
}

fun main() {
    MyClass.print();
    MyClass2.print()
}