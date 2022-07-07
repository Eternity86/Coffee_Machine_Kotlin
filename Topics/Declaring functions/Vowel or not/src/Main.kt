// write your function here
fun isVowel(a: Char): Boolean =
    a.lowercaseChar() == 'a' ||
        a.lowercaseChar() == 'e' ||
        a.lowercaseChar() == 'i' ||
        a.lowercaseChar() == 'o' ||
        a.lowercaseChar() == 'u'

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}