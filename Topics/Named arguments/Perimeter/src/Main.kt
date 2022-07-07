import kotlin.math.hypot

fun perimeter(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double = x3,
    y4: Double = y3
): Double {
    val ab = getDistance(x1, y1, x2, y2)
    val bc = getDistance(x2, y2, x3, y3)
    val cd = getDistance(x3, y3, x4, y4)
    val da = getDistance(x1, y1, x4, y4)
    return ab + bc + cd + da
}

fun getDistance(x1: Double, y1: Double, x2: Double, y2: Double): Double = hypot(x2 - x1, y2 - y1)