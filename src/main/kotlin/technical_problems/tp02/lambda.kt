package technical_problems.tp02

/**
 *  Lambda Expression Problem:
 *  Complete the given program code that will ask the user to enter
 *  some string and display the vowels and consonants characters
 */
fun main() {
    print("Enter some string: ")
    val str = readLine()
    val vowels = str?.filter {
            it -> (it == 'a' || it == 'e' || it == 'i' || it == 'o' || it == 'u'
                || it == 'A' || it == 'E' || it == 'I' || it == 'O' || it == 'U')
    }

    val constants = str?.filter {
            it -> (it != 'a' && it != 'e' && it != 'i' && it != 'o' && it != 'u'
                && it != 'A' && it != 'E' && it != 'I' && it != 'O' && it != 'U'
                && (it in 'a'..'z' || it in 'A'..'Z')
                && it.isLetter())
    }

    println("Vowels: $vowels")
    println("Consonants: $constants")

}