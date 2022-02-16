package guide_practice.ch01_kotlin_basics.fundamentals

fun main() {
    val b: Byte = 1 // OK, literals are checked statically
    //val i: Int = b // ERROR

    val i: Int = b.toInt() // OK: explicitly widened
    print(i)
}