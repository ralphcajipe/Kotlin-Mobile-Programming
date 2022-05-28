package technical_summative.ts01

/**
 * Summation:
 * Create a program that will display the sum of the numbers from the two input integer numbers.
 * The first number must be the lower limit and the second number must be the upper limit.
 * If the lower limit is greater than the upper limit or one of the value is negative,
 * the output is Invalid
 *
 * //Example Output 1
 *  5
 *  8
 *  26
 *
 *  //Example Output 2
 *  13
 *  2
 *  Invalid
 *
 *  //Example Output 3
 *  -8
 *  7
 *  Invalid
 */

fun main() {
    val first = readLine()
    val second = readLine()

    if (first == null || second == null) return
    try {
        val firstInt = first.toInt()
        val secondInt = second.toInt()

        // If the lower limit is greater than the upper limit or
        // one of the value is negative
        if (firstInt < 0 || firstInt > secondInt) {
            println("Invalid")
            return
        }

        var sum = 0
        for (i in firstInt..secondInt) sum += i
        println(sum)
    } catch (nfe: NumberFormatException) {
        println("Invalid")
    }
}

