fun main() {
    // write your code here
    println(
        when (readln().toInt()) {
            1 -> "No!"
            2 -> "Yes!"
            3 -> "No!"
            4 -> "No!"
            else -> "Unknown number"
        }
    )
}