package guide_practice.fundamentals

fun main() {
    fun decimalDigitValue(c: Char): Int {
        if (c !in '0'..'9')
            throw IllegalArgumentException("Out of range")
        return c.toInt() - '0'.toInt() // Explicit conversions to numbers, you can remove .toInt()
    }

    val ch = '5'
    val x = decimalDigitValue(ch) + 8
    print("The value of x is $x")
}