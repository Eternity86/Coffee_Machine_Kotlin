const val INITIAL_PRICE = 20000

// complete this function, add default values
fun carPrice(old: Int = 5, kilometers: Int = 100000, maximumSpeed: Int = 120, automatic: Boolean = false) {
    var price = INITIAL_PRICE - old * 2000
    price -= (120 - maximumSpeed) * 100
    price -= kilometers / 10000 * 200
    if (automatic) price += 1500
    println(price)
}