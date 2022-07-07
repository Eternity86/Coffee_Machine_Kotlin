// write your code here
fun square(a: Int): Long = (a * a).toLong()

/* Do not change code below */
fun main() {
    val number = readLine()!!.toInt()
    println(square(number))
}