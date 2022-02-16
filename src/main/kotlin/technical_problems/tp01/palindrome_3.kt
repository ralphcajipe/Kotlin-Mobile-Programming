package technical_problems.tp01

import java.util.*

fun main(args: Array<String>) {
    val userInput = Scanner(System.`in`)
    var s1: String
    var reverse: String = ""
    s1 = userInput.nextLine()
    var l: Int = s1.length - 1

    while (l != -1) {
        reverse += s1[l--];
    }
    if (s1 == reverse) println("$s1 is a palindrome")
    else println("$s1 is not a palindrome")
}
