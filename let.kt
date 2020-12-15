

fun main() {
   /* // Dont do this
    val order: Order? = findOrder()
    if (order != null) {
        dun(order.customer)
    } */

   /* //Do This
    findOrder()?.let { dun(it.customer) }
    // or
    findOrder()?.customer?.let(::dun) */
}
