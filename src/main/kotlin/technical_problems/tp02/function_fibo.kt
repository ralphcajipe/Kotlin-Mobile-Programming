package technical_problems.tp02

/**
 *  Function Problem: Fibonacci Sequence
 *  The Fibonacci sequence is a series of numbers where
 *  a number is the addition of the last two numbers, starting with 0, and 1.
 *  The Fibonacci Sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55…
 *
 *  Written as a rule, the expression is:
 *  Xn = Xn-1 + Xn-2
 *
 *  Complete the given program code that will compute
 *  the sum of the terms of the Fibonacci sequence.
 */

fun fiboSum(n: Int): Int {
    var t1 = 0
    var t2 = 1
    var res = 0

    for (i in 1..n) {
        print("$t1 ")
        res += t1
        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }
    return res
}


fun main() {
    print("Enter number of Terms: ")
    val n: Int? = readLine()?.toIntOrNull()
    // 	var n = 45
    //  print("$n")
    if (n == null || n < 1) {
        println("Invalid Input")
    } else {
        val res = fiboSum(n)
        println("The sum is $res")
    }

}