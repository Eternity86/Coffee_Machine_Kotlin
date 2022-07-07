fun main(args: Array<String>) {
    // write your code here
    val actualSpeed = readln().toInt()
    val limit = readln()
    if (limit == "no limit") checkLimit(actualSpeed) else checkLimit(actualSpeed, limit.toInt())
}

fun checkLimit(speed: Int, limit: Int = 60) {
    val exceed = speed - limit
    if (exceed > 0) println("Exceeds the limit by $exceed kilometers per hour") else println("Within the limit")
}