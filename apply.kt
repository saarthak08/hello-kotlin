class Hello {
    var x:Int=0;
    var y:Int=0;
}


fun main() {
    var f=Hello().apply { 
        x=2;
        y=3;
     }

     println(f);
}