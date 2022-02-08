package technical_formative.m1_basics

fun main() {
    print("Enter 1st number: ")
    val num1 = readInt()

    print("Enter 2nd number: ")
    val num2 = readInt()

    print("Enter 3rd number: ")
    val num3 = readInt()

    val largest = if (num1 > num2 && num1 > num3)
        num1
    else if (num2 > num3)
        num2
    else
        num3

    println("The highest value from $num1, $num2, $num3 inputted numbers is $largest")

}

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
