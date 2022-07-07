fun main() {
    // put your code here
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    println(if (b < c) a in b..c else a in c..b)
}