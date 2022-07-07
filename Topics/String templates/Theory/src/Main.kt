// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
  // put your code here
    val b1 = true
    val b2 = true
    println(b1 || !!b2)
    println(!(b1 || b2)) // true
    println(!b1 && b2)
    println(!b1 && !b2) // true
    println(!b1 || b2) // true
}
