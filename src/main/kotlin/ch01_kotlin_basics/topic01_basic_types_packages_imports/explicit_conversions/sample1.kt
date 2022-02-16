package ch01_kotlin_basics.topic01_basic_types_packages_imports.explicit_conversions

fun main(){
    fun main() {
        val b: Byte = 1 // OK, literals are checked statically
        // val i: Int = b // ERROR
        val i1: Int = b.toInt()
    }
}