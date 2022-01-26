package formative.module1

/**
 * Sort String Characters:
 * Create a program that sort the letters from the given input string
 */
fun main(args: Array<String>) {
    val str = readLine()
    val arr = str!!.toCharArray()
    println(arr.sorted().joinToString(""))
}


/**
import java.util.Scanner

fun main(){
val read = Scanner(System.`in`)

print("")
val str = read.nextLine()

val arr = str.toCharArray()
println(arr.sorted().joinToString("")) // sorted letters
}
 */


