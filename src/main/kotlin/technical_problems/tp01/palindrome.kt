package technical_problems.tp01

/**
 * Palindrome:
 * Create a program that will ask the user to enter a string and checks if
 * the given string is palindrome or not palindrome
 * regardless of their cases (upper case lower case)
 */

fun main() {
    print("")
    val originalString = readLine()!!

    var reverseString = ""
    val length = originalString.length

    for (i in (length - 1) downTo 0) {
        reverseString += originalString[i]
    }

    // Case in-sensitive comparison
    if (originalString.equals(reverseString, ignoreCase = true)) {
        println("${'"'}$originalString${'"'} is a palindrome")
    } else {
        println("${'"'}$originalString${'"'} is not a palindrome")
    }
}