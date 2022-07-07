fun main() {
    // put your code here
    val n = readln().toInt()
    var positiveCount = 0
    repeat(n) {
        val s = readln().toInt()
        if (s > 0) positiveCount++
    }
    println(positiveCount)
}