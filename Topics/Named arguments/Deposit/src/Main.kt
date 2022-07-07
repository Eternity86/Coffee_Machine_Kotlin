import kotlin.math.pow

fun compoundInterest(amount: Int = 1000, percent: Int = 5, years: Int = 10): Int =
    (amount * (1 + percent / 100.0).pow(years)).toInt()

fun main() {
    // write your code here
    val param = readln()
    val num = readln().toInt()
    when (param) {
        "amount" -> println(compoundInterest(amount = num))
        "percent" -> println(compoundInterest(percent = num))
        "years" -> println(compoundInterest(years = num))
    }
}