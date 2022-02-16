package ch01_kotlin_basics.topic01_basic_types_packages_imports.literal_constants

fun main() {
    val b: Int = 10000
    println(b == b) // Prints 'true'
    val boxedB: Int? = b
    val anotherBoxedB: Int? = b
    println(boxedB == anotherBoxedB) // Prints 'true'
}