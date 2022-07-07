fun main() {
    // write your code here
    val a = readln().toInt()
    if (a > -15 && a <= 12
        || a in 15..16
        || a >= 19) println("True") else println("False")
}