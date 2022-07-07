fun main() {
    // write your code here
    val cups = readln().toInt()
    val isWeekend = readln().toBoolean()
    println(!isWeekend && cups in 10..20 || isWeekend && cups in 15..25)
}