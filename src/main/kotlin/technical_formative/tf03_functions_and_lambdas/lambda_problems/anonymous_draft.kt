package technical_formative.tf03_functions_and_lambdas.lambda_problems

/**
 * Simplify the given code and use anonymous function
 * so that it will check if a given string is a palindrome.
 * The program should ignore white space and their cases.
 */

fun main() {
    print("Enter a string: ")
    val str = rd()

    //Anonymous function
    val isPalindrome = fun(str: String): Boolean {
        return str == str.reversed()
    }

    if (isPalindrome(str)) {
        print("$str is palindrome")
    } else {
        print("$str is not palindrome")
    }
}

private fun rd() = readLine()!!
private fun rdInt() = rd().toInt()

/**
import java.util.*


//Main function
fun main() {
val sc = Scanner(System.`in`)
print("Enter a string: ")
val inStr: String = sc.nextLine()

if (isPalindromeString(inStr)) {
println("$inStr is a palindrome")
} else {
println("$inStr is not palindrome")
}
}


fun isPalindromeString(inputStr: String): Boolean {
val sb = StringBuilder(inputStr)
val reverseStr = sb.reverse().toString()
return inputStr.equals(reverseStr, ignoreCase = true)
}
 */

