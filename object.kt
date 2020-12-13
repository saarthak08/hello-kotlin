/*
The "object" keyword can be used to create singleton objects.
We cannot instantiate it but we can refer to its unique instance by its name.
This is similar to Scala singleton objects.
*/
object ObjectExample {
    fun hello(): String {
        return "hello"
    }

    override fun toString(): String {
        return "Hello, it's me, ${ObjectExample::class.simpleName}"
    }
}


fun useSingletonObject() {
    println(ObjectExample.hello()) // => hello
    // In Kotlin, "Any" is the root of the class hierarchy, just like "Object" is in Java
    val someRef: Any = ObjectExample
    println(someRef) // => Hello, it's me, ObjectExample
}

fun main() {
    useSingletonObject();
}