// write your function here
fun sum(a: Int, b: Int, c: Int): Long = (a + b + c).toLong()

fun main() {    
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    println(sum(a, b, c))
}