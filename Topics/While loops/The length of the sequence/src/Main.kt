fun main() {
    // put your code here
    var s = readln().toInt()
    var length = 0
    while (s != 0) {
        length++
        s = readln().toInt()
    }
    println(length)
}