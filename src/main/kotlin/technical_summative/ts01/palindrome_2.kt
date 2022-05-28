package technical_summative.ts01

import java.util.*

fun main() {
    val word = readLine()!!.toString()
    val str = word.uppercase(Locale.getDefault()).reversed()
    val upperWord = word.uppercase(Locale.getDefault())
    if (upperWord == str) {
        print("\"$word\" is a palindrome")
    } else {
        print("\"$word\" is not a palindrome")
    }
}
