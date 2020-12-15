interface hello {
    fun print();
    fun k();
}

class Implementaion() : hello {
    override fun print() {
        println("Hello! Print in Implementaion");
    }
    override fun k() {
        println("k in implementation");
    }
}

class Base(b: hello) : hello by b {
    override fun k() {
        println("k in coding")
    }
}

fun main() {
    val x=Base(Implementaion());
    x.print();
    x.k();
}