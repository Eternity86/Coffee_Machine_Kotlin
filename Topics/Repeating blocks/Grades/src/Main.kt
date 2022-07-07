const val D = 2
const val C = 3
const val B = 4
const val A = 5

fun main() {
    // put your code here
    val n = readln().toInt()
    var countD = 0
    var countC = 0
    var countB = 0
    var countA = 0
    repeat(n) {
        when (readln().toInt()) {
            D -> countD++
            C -> countC++
            B -> countB++
            A -> countA++
        }
    }
    println("$countD $countC $countB $countA")
}