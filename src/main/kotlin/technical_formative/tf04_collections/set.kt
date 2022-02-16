package technical_formative.tf04_collections

/**
 * Set Collection Problem: Students
 * Given the following sets of students find the following as given.
 * math = {"Juan","Carlo","Cynthia","Marc","Lucio","Carla"}
 * english = {"Carlo","Marc","Carla","Tina"}
 *
 * 1. How many enrolled in:
 *      a. math
 *      b. english
 *      c. both subjects
 * 2. List all the students
 * 3. Who are the students enrolled only in math but not in english
 * 4. Who are the students enrolled only in english and only in math but not both subjects
 */

fun main() {
    val math = setOf<String>("Juan", "Carlo", "Cynthia", "Marc", "Lucio", "Carla")
    val english = setOf<String>("Carlo", "Marc", "Carla", "Tina")

    println("There are ${math.count()} students enrolled in math")
    println("There are ${english.count()} students enrolled in english")
    println("There are ${(math intersect english).count()} students enrolled in both subject")
    println("List of all students \n${math union english}")
    println("List of math students only \n${math subtract english}")
    println("List of students not in both subjects \n${(math union english) subtract (math intersect english)}")
}