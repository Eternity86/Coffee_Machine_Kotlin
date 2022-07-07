const val DEFAULT_MAX_POPULATION = 50_000_000
const val DEFAULT_MIN_POPULATION = 0

class City(val name: String) {
    var population: Int = DEFAULT_MIN_POPULATION
        set(v) {
            field = setDefault(v)
        }

    private fun setDefault(v: Int): Int {
        return if (v < 0) {
            DEFAULT_MIN_POPULATION
        } else if (v > DEFAULT_MAX_POPULATION) {
            DEFAULT_MAX_POPULATION
        } else {
            v
        }
    }
}

fun main() {
    val smartOne = Smartphone("Ericsong")
    smartOne.price = -24
    val smartTwo = Smartphone("iNokhe")
    print(smartTwo.price - smartOne.price)
}

class Smartphone(val name: String) {
    var price: Int = -5
        get() = name.length - field
}
