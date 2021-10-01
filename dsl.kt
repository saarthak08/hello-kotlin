data class Puppy(var name:String, var count:Int);

fun puppy(init:(Puppy)->Unit):Puppy {
    val puppy = Puppy("Bruno",0);
    init(puppy);
    return puppy;
}

fun puppyGreet(greet:Puppy.()->Unit):Puppy {
    val puppy=Puppy("Oscar",0);
    puppy.apply(greet);
    return puppy;
}

fun main() {
    val x=puppy {
        it.count=it.count+1;
    }
    println(x.name);
    println(x.count)

    puppyGreet { 
        name="Helloooooo";
     }.let { 
         println(it.name);
         println(it.count)
      }
}


