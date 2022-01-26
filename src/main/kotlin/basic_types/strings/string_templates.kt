package basic_types.strings

fun main() {
    val number = 10
    println("number = $number") // prints "i = 10"


    val string = "abc"
    println("$string.length is ${string.length}") // prints "abc.length is 3"


    val price = """
    ${'$'}_9.99
    """
    println(price)

}