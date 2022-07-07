fun main() {
    val mercedes = true
    val red = true
    val enoughMoney = true

    val buyCar = enoughMoney && (!mercedes || red)
    println(buyCar)
}