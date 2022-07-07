fun main() {
    val d = readln().toInt()
    val a = d / 100
    val b = d % 100 / 10
    val c = d % 10

    println(a + b + c)
}
