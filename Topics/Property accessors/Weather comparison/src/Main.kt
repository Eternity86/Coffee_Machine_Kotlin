const val DEFAULT_MIN = -92
const val DEFAULT_MAX = 57
const val DEFAULT_DUBAI = 30
const val DEFAULT_MOSCOW = 5
const val DEFAULT_HANOI = 20

class City(val name: String) {
    var degrees: Int = setDefault()
        set(value) = if (value < DEFAULT_MIN || value > DEFAULT_MAX) field = setDefault() else field = value

    private fun setDefault(): Int {
        return when (name) {
            "Dubai" -> DEFAULT_DUBAI
            "Moscow" -> DEFAULT_MOSCOW
            "Hanoi" -> DEFAULT_HANOI
            else -> 0
        }
    }

    fun isMinOf(other1: City, other2: City): Boolean {
        return this.degrees < other1.degrees && this.degrees < other2.degrees
    }
}

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third

    // implement comparing here
    print(
        when {
            firstCity.isMinOf(secondCity, thirdCity) -> firstCity.name
            secondCity.isMinOf(firstCity, thirdCity) -> secondCity.name
            thirdCity.isMinOf(firstCity, secondCity) -> thirdCity.name
            else -> "neither"
        }
    )
}