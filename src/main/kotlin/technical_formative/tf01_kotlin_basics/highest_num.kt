package technical_formative.tf01_kotlin_basics

/**
 * The highest number:
 * You should write a program that inputs three integer numbers and
 * display the highest value on the screen
 */

import java.util.Scanner

fun main() {

    val read = Scanner(System.`in`)

    print("Enter 1st number: ")
    val first = read.nextInt()

    print("Enter 2nd number: ")
    val second = read.nextInt()

    print("Enter 3rd number: ")
    val third = read.nextInt()

    val largest = if (first > second && first > third)
        first
    else if (second > third)
        second
    else
        third

    println("The highest value from $first, $second, $third inputted numbers is $largest")
}