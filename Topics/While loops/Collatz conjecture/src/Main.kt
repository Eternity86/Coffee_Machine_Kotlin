fun main() {
    // put your code here
    var s = readln().toInt()
    print("$s ")
    while (s != 1) {
        if (s % 2 == 0) {
            s /= 2
        } else {
            s = s * 3 + 1
        }
        print("$s ")
    }
}