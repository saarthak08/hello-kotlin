import kotlin.reflect.KProperty
import kotlin.properties.Delegates

//Lazy Delegation
class Example {
    val lazyValue: String by lazy {
        println("computed!")
        "Hello"
    }
    
    val p: String by lazy {
        println("Computed!")
        "Hello"
    }
}

//Observable Delegate
class ObservedProperty {
    var name: String by Delegates.observable("<not set>") {
        prop, old, new -> println("Old value: $old, New value: $new")
    }
}


//Delegation
class Resource

class Owner {
    var varResource: Resource by ResourceDelegate()
}

class ResourceDelegate(private var resource: Resource = Resource()) {
    operator fun getValue(thisRef: Owner, property: KProperty<*>): Resource {
        return resource
    }
    operator fun setValue(thisRef: Owner, property: KProperty<*>, value: Any?) {
        if (value is Resource) {
            resource = value
        }
    }
}

//Delegation to another property
class My {
    var newName: Int = 0
    @Deprecated("Use 'newName' instead", ReplaceWith("newName"))
    var oldName: Int by this::newName
 }
 
 fun main() {
    val myClass = My()
    // Notification: 'oldName: Int' is deprecated.
    // Use 'newName' instead
    myClass.oldName = 42
    println(myClass.newName) // 42

    val user = User(mapOf(
        "name" to "John Doe",
        "age"  to 25
    ));
    println(user.name) // Prints "John Doe"
    println(user.age)  // Prints 25  
 }

//Delegation via map
 class User(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int     by map
}

