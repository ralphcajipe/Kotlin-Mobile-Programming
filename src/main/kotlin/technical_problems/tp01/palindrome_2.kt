package technical_problems.tp01

fun main() {
    val word = readLine()!!.toString()
    val str = word.toUpperCase().reversed()
    val upperWord = word.toUpperCase()
    if (upperWord == str) {
        print("\"$word\" is a palindrome")
    } else {
        print("\"$word\" is not a palindrome")
    }
}
