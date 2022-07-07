import kotlin.math.sqrt

const val PI = 3.14

fun triangleArea(a: Double, b: Double, c: Double): Double {
    val p = (a + b + c) / 2
    return sqrt(p * (p - a) * (p - b) * (p - c))
}

fun rectangleArea(a: Double, b: Double): Double = a * b

fun circleArea(r: Double): Double = PI * (r * r)

fun main() {
    // write your code here
    println(
        when (readln()) {
            "triangle" -> {
                val a = readln().toDouble()
                val b = readln().toDouble()
                val c = readln().toDouble()
                triangleArea(a, b, c)
            }
            "rectangle" -> {
                val a = readln().toDouble()
                val b = readln().toDouble()
                rectangleArea(a, b)
            }
            "circle" -> {
                val r = readln().toDouble()
                circleArea(r)
            }
            else -> {}
        }
    )
}