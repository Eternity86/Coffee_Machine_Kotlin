// write your code here
const val DIVIDER = 10

fun getLastDigit(a: Int): Int {
    return kotlin.math.abs(a % DIVIDER)
}

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}
