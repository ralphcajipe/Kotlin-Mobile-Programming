package formative.module1

/**
 * Sum of Two Integer Numbers:
 * You should write a program that inputs two integer numbers and display the sum on the screen
 */

import java.util.Scanner

fun main() {

    val read = Scanner(System.`in`)

    print("Enter 1st number: ")
    val firstNum = read.nextInt()

    print("Enter 2nd number: ")
    val secondNum = read.nextInt()

    val sum = firstNum + secondNum

    println("The sum of $firstNum and $secondNum is $sum")
}