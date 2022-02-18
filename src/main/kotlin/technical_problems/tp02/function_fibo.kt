package technical_problems.tp02

/**
 *  Function Problem: Fibonacci Sequence
 *  The Fibonacci sequence is a series of numbers where
 *  a number is the addition of the last two numbers, starting with 0, and 1.
 *
 *  The Fibonacci Sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55…
 *
 *  Written as a rule, the expression is:
 *  Xn = Xn-1 + Xn-2
 *
 *  Complete the given program code that will compute
 *  the sum of the terms of the Fibonacci sequence.
 *  #################################################
 *  fun main(){
 *       print("Enter number of Terms: ")
 *       var n: Int? = readLine()?.toIntOrNull()
 *       // some code
 *  }
 *
 *  fun fiboSum(n:Int): Int{
 *  // fibonacci code
 *  }
 *  #################################################
 *  TEST CASE:
 *
 *  Example Output 1
 *  Enter number of Terms: 5
 *  0 1 1 2 3 The sum is 7
 *
 *  Example Output 2
 *  Enter number of Terms: 9
 *  0 1 1 2 3 5 8 13 21 The sum is 54
 *
 *  Example Output 3
 *  Enter number of Terms: -8
 *  Invalid Input
 *
 *  Example Output 4
 *  Enter number of Terms: one
 *  Invalid Input
 *
 *  Example Output 5
 *  Enter number of Terms: 1.25
 *  Invalid Input
 */

fun fiboSum(n: Int): Int {
    var t1 = 0
    var t2 = 1
    var fiboResult = 0

    for (i in 1..n) {
        print("$t1 ")
        fiboResult += t1
        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }
    return fiboResult
}


fun main() {
    print("Enter number of Terms: ")
    val n: Int? = readLine()?.toIntOrNull()
    // 	var n = 9
    //  print("$n")
    if (n == null || n < 1) {
        println("Invalid Input")
    } else {
        val fiboResult = fiboSum(n)
        println("The sum is $fiboResult")
    }

}