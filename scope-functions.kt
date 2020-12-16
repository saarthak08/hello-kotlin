class Userr(var firstName:String,var lastName:String) {
    var age:Int?=null;

    fun hello() {
        println("Hello from Userr! $firstName $lastName");
    }
}

fun main() {
    var x=Userr("Saarthak","Gupta");

    //It'll return the object it was invoked on, which makes it handy when we want to generate some side logic on a call chain:
    x.also {
        it.age=23;
        it.hello();
    }

    x.apply {
        println("Hello! I am apply");
        lastName="No Last Name";
        println(toString());
    }

    //First, we can use let to convert from one object type to another, like taking a StringBuilder and computing its length:
    val stringBuilder = StringBuilder()
    var numberOfCharacters = stringBuilder.let {
        it.append("This is a transformation function.")
        it.append("It takes a StringBuilder instance and returns the number of characters in the generated String")
        it.length
    }
    println(numberOfCharacters);


    val message = StringBuilder()
    numberOfCharacters = message.run {
    append("This is a transformation function.")
    append("It takes a StringBuilder instance and returns the number of characters in the generated String")
        length
    }
    println(numberOfCharacters);
 ̰
}