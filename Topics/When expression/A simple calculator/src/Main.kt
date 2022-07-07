fun main() {
    // write your code here
    val (a, op, b) = readln().split(" ")
    val first = a.toLong()
    val second = b.toLong()
    println(
        when (op) {
            "+", "add" -> first + second
            "-", "sub" -> first - second
            "/", "div" -> {
                if (second == 0L) {
                    println("Division by 0!")
                    return
                }
                first / second
            }
            "*", "mul" -> first * second
            else -> "Unknown operator"
        }
    )
}