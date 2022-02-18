package technical_formative.tf03_functions_and_lambdas.function_problems

/**
 * The product of odd or even digit numbers:
 * Complete the given code so that the value
 * of all odd or even input digit numbers will be multiplied.
 */
fun main() {
    print("Enter a number string of digits: ")
    val input: List<Int> = readLine()
        .orEmpty()
        .split("")
        .mapNotNull { it.toIntOrNull() }


    print("Display the product of odd digit numbers [Y/N]: ")
    val odd = if (readLine() == "Y") 1 else 0
    val prod = input
        .filter { it != 0 && it % 2 == odd }
        .reduce(Int::times)


    println("The product is $prod")
}