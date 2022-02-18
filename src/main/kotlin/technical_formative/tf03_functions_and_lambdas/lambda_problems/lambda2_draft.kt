package technical_formative.tf03_functions_and_lambdas.lambda_problems

fun main() {
    val numbers = mutableListOf<Int>()

    while (true) {
        print("Enter number ${numbers.count() + 1}: ")
        val input = readln()
        if (input.trim() == "" || input.toIntOrNull() == null) continue
        numbers.add(input.toInt())
        if (numbers.count() == 5) break
    }

    val evens = numbers.filter { it > 0 && it % 2 == 0 }
    val odds = numbers.filter { it > 0 && it % 2 != 0 }

    val productOfEvens = evens.reduce { acc, i -> acc * i }
    val productOfOdds = odds.reduce { acc, i -> acc * i }

    println("The product of $evens is $productOfEvens")
    println("The product of $odds is $productOfOdds")

}