fun main() {
    // put your code here
    val n = readln().toInt()
    var max = Int.MIN_VALUE
    repeat(n) {
        val s = readln().toInt()
        if (s % 4 == 0 && s >= max) max = s
    }
    println(max)
}