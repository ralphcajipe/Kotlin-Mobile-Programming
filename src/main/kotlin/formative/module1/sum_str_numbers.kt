package formative.module1

/**
 * Sum of String Numbers:
 * Create a program that will compute the
 * sum and average of a string inputted numbers.
 * Use array manipulation.
 */
fun main(args: Array<String>) {
    val input = readLine()!!.toString()
    val chars = input.toCharArray()
    var sum = 0
    for (i in chars.indices) {
        val int = chars[i].toString().toInt()
        sum += chars[i].toString().toInt()
    }
    val ave = sum / chars.size.toDouble()
    print("$sum %.2f".format(ave))
}