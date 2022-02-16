package technical_formative.tf03_functions_and_lambdas

/**
 * Function - Sum of Odd or Even Numbers:
 * Complete the given program code by creating the sumOfOdd function
 * so that when program executes, it will display the sum of the numbers
 * of Odd or Even from 1 to the input value.
 */

fun main() {
    print("Enter a number: ")
    val a = rdInt()
    print("Display the sum of odd numbers[Y/N]: ")
    val choice = rd()
    var isOdd = false
    if (choice.equals("Y")) isOdd = true
    sumOfOdd(isOdd, a) //create this function
}

private fun rd() = readLine()!!
private fun rdInt() = rd().toInt()

// sumOfOdd function
fun sumOfOdd(isOdd: Boolean, a: Int): Unit {
    var sum = 0
    for (i in 1..a) {
        if (isOdd && i % 2 == 1) sum += i
        if (!isOdd && i % 2 == 0) sum += i
    }
    if (isOdd) println("The sum of odd numbers from 1 to $a is $sum.")
    else println("The sum of even numbers from 1 to $a is $sum.")
}