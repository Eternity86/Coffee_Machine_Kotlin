fun main() {
    // put your code here
    val n = readln().toInt()
    var larger = 0
    var smaller = 0
    var perfect = 0
    repeat(n) {
        val s = readln().toInt()
        if (s == 1) larger++
        if (s == -1) smaller++
        if (s == 0) perfect++
    }
    println("$perfect $larger $smaller")
}