package ch01_kotlin_basics.topic01_basic_types_packages_imports.strings

fun main(){
    val s = "Hello, world!\n"
    println(s)


    // raw string
    val text = """
    for (c in "foo")
        print(c)
"""
    println(text)


    // To remove leading whitespace from raw strings,
    // use the trimMargin() function:
    val text2 = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()
    println(text2)


}