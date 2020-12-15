//demoArgConstructor argument becomes field of class.
class DemoClass(val demoArgConstructor:Int=420) {
  
    //variables either have to be initialised or declared abstract.
    private var privateVar:String=""
        get() =  field
        private set(value) {
            field=value;
        }


    //initializer block. Initializer executes before constructor.
    init {
        println("Hello! I am the initializer");
        this.privateVar="private Var";
        println("private var value: ${this.privateVar}");
    }

    var publicVar:String?=null
        get() {
            return field;
        }
        set(value) {
            field=value;
            this.privateVar = value!!;
            println("Private Var: $privateVar");
        }
 
    //Constructor Overloading. Constructor has to call primary constructor in order to initialise the primary constructor arguments.
    constructor(str:String="Hello"):this(420) {
        println("Secondary Constructor + $str");
        this.publicVar=str;
    }

    fun demoFunction():Unit {
        println(publicVar+" "+this.demoArgConstructor);
    }
}

/*
    Data classes are a concise way to create classes that just hold data.
    The "hashCode"/"equals" and "toString" methods are automatically generated.
*/
data class DataClassExample (val x: Int, val y: Int, val z: Int)

fun main() {
    val x=DemoClass("abc");
    x.demoFunction();
    x.publicVar="Hello World! Public Var"
    val fooData = DataClassExample(1, 2, 4)
    println(fooData) // => DataClassExample(x=1, y=2, z=4)


    // Objects can be destructured into multiple variables.
    val (a, b, c) = fooData
    println("$a $b $c") // => 1 100 4


}