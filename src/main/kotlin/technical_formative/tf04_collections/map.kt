package technical_formative.tf04_collections

/**
 * Map Collection Problem: Word Frequencies
 * Complete the given program code below so that
 * it will count the number of frequencies of
 * unique words from the given input string.
 */

fun main() {
    val uniqueWords = mutableMapOf<String, Int>()
    print("Enter a string: ")
    val str = rdLn()
    val words = str.toLowerCase().split(" ")
    words.forEach {
        // Check if word is in uniquewords and increment count
        if (uniqueWords.containsKey(it)) {
            uniqueWords.put(it, uniqueWords.getValue(it) + 1)
        } else {// else add it to the uniquewords
            uniqueWords.put(it, 1)
        }
    }
    print(uniqueWords)
}

private fun rdLn() = readLine()!!
private fun rdInt() = rdLn().toInt()