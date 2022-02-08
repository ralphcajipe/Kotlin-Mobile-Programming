package technical_formative.m1_basics

/**
 * Sum of Two Integer Numbers:
 * You should write a program that inputs two integer numbers and display the sum on the screen
 *
 * //Example output
 * Enter 1st number: 10
 * Enter 2nd number: 20
 * The sum of 10 and 20 is 30
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