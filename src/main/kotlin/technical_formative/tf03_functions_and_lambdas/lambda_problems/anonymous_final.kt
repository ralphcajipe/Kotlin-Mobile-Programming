package technical_formative.tf03_functions_and_lambdas.lambda_problems

/**
 * Function that will check if a given string is a palindrome.
 * The program ignores white space and their cases.
 */

import java.util.*


// Main function
fun main() {
    val sc = Scanner(System.`in`)
    println("Enter String : ")

    val inStr: String = sc.nextLine()

    if (isPalindromeString(inStr)) {
        println("$inStr is a Palindrome")
    } else {
        println("$inStr is not a Palindrome")
    }
}


fun isPalindromeString(inputStr: String): Boolean {
    val inputString = inputStr.replace("\\s".toRegex(), "")
    val sb = StringBuilder(inputString)
    val reverseStr = sb.reverse().toString()
    return inputString.equals(reverseStr, ignoreCase = true)
}

/**
fun isPalindromeString(inputStr: String): Boolean {
val sb = StringBuilder(inputStr)
val reverseStr = sb.reverse().toString()
return inputStr.equals(reverseStr, ignoreCase = true)
}
 */

