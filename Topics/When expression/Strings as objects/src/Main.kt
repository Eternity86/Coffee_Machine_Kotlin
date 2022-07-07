fun main() {
    var input = readLine()!!
    // write code here
    if (input.isEmpty()) return
    println(
        when (input.first()) {
            'i' -> {
                input = input.drop(1)
                input.toInt() + 1
            }
            's' -> {
                input = input.drop(1)
                input.reversed()
            }
            else -> input
        }
    )
}