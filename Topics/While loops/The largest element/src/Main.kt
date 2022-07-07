fun main() {
    // put your code here
    var s = readln().toInt()
    var max = Int.MIN_VALUE
    while (s != 0) {
        if (s > max) max = s
        s = readln().toInt()
    }
    println(max)
}