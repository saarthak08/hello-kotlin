
//JSON creation is easy in kotlin
fun main() {
    val customer = mapOf(
            "name" to "Clair Grube",
            "age" to 30,
            "languages" to listOf("german", "english"),
            "address" to mapOf(
                    "city" to "Leipzig",
                    "street" to "Karl-Liebknecht-Straße 1",
                    "zipCode" to "04107"
            )
    )
    println(customer);
}