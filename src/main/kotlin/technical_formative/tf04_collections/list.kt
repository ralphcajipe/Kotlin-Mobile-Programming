package technical_formative.tf04_collections

/**
 * List Collection Problem: String Word Reversed
 * Complete the program that will reverse each word on the given string
 */

fun main(){
    print("Enter a string: ")
    val str = rdLn()
    val words = str.split(" ")
    val newStr = wordReverse(words)
    println("new string length: ${newStr.length}")
    println(newStr)
}

fun wordReverse(words: List<String>): String{
    // List Manipulation Code Here
    var revWord = String()
    for (word in words) {
        revWord = revWord + " " + word.reversed()
    }
    return revWord.trim()
}

private fun rdLn() = readLine()!!
private fun rdInt() = rdLn().toInt()