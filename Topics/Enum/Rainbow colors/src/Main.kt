fun main() {
    // put your code here
    val color = readln()
    for (enum in Rainbow.values()) {
        if (color == enum.color.lowercase()) {
            println(true)
            return
        }
    }
    println(false)
}

enum class Rainbow(val color: String) {
    RED("Red"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue"),
    INDIGO("Indigo"),
    VIOLET("Violet")
}