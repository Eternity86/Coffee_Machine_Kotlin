fun main() {
    val timerValue = readLine()!!.toInt()
    val timer = ByteTimer(timerValue)
    println(timer.time)
}

class ByteTimer(var time: Int) {
    init {
        if (time < Byte.MIN_VALUE) time = Byte.MIN_VALUE.toInt()
        if (time > Byte.MAX_VALUE) time = Byte.MAX_VALUE.toInt()
    }
}