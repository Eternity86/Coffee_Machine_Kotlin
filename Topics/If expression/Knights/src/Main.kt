import java.util.Scanner

fun main() {
    // write your code here
    val scan = Scanner(System.`in`)
    val (x1, y1) = List(2) {scan.nextInt()}
    val (x2, y2) = List(2) {scan.nextInt()}

    if (y2 - y1 == 1 && x2 - x1 == 2 || y2 - y1 == 2 && x2 - x1 == 1) println("YES") else println("NO")
}