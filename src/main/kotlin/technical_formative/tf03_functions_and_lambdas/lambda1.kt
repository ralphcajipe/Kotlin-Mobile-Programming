package technical_formative.tf03_functions_and_lambdas

fun main() {
    print("Enter some string: ")
    val str = rd()
    var noOfVowels = 0
    val filterStr = str.filter {
        // Lambda Expression: Check if a character is a vowel
        when (it) {
            'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true
            else -> false
        }
    }
    // After Lambda expression, we count the length of the
    // above sequence to find the actual number of vowels.
    // Counting the total no. of vowels after the function above.
    noOfVowels = filterStr.length
    println("There are $noOfVowels vowel(s)")
}

private fun rd() = readLine()!!
private fun rdInt() = rd().toInt()