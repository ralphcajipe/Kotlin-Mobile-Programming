package technical_formative.tf03_functions_and_lambdas.lambda_problems

/**
 * Program will ask the user to enter five integer numbers,
 * only positive numbers will remain from the input numbers
 * that will use to display the product of odd numbers and
 * product of even numbers.
 */

fun main() {
    val numbers = mutableListOf<Int>()

    while (true) {
        print("Enter number ${numbers.count() + 1}: ")
        val input = readLine()
        if (input != null) {
            if (input.trim() == "" || input.toIntOrNull() == null) continue
        }
        if (input != null) {
            numbers.add(input.toInt())
        }
        if (numbers.count() == 5) break
    }

    val evens = numbers.filter { it > 0 && it % 2 == 0 }
    val odds = numbers.filter { it > 0 && it % 2 != 0 }

    val productOfEvens = evens.reduce { acc, i -> acc * i }
    val productOfOdds = odds.reduce { acc, i -> acc * i }

    println("The product of $evens is $productOfEvens")
    println("The product of $odds is $productOfOdds")

}