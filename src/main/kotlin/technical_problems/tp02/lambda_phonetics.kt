package technical_problems.tp02

/**
 *  Lambda Expression Problem:
 *  Complete the given program code that will ask the user to enter
 *  some string and display the vowels and consonants characters
 *  ################################################################
 *  fun main() {
 *      print("Enter some string: ")
 *      val str = rdLn()
 *
 *      val vowels = str.filter {
 *      // some code here
 *      }
 *
 *      val consonants = str.filter {
 *      //some code here
 *      }
 *
 *      println("Vowels: $vowels")
 *      println("Consonants: $consonants")
 *  }
 *
 *  private fun rdLn() = readLine()!!
 *  private fun rdInt() = rdLn().toInt()
 *  #################################################################
 *  TEST CASE:
 *
 *  Example Output 1
 *  Enter some string: the quick brown fox
 *  Vowels: euioo
 *  Consonants: thqckbrwnfx
 *
 *  Example Output 2
 *  Enter some string: There are 56 students enrolled
 *  Vowels: eeaeueeoe
 *  Consonants: Thrrstdntsnrlld
 *
 *  Example Output 3
 *  Enter some string: underscore(_) asterisk(*) and hashtag(#)
 *  Vowels: ueoeaeiaaa
 *  Consonants: ndrscrstrskndhshtg
 */


fun main() {
    print("Enter some string: ")
    val str = readLine()

    // Check if input string has vowels
    val vowels = str?.filter { it ->
        (it == 'a' || it == 'e' || it == 'i' || it == 'o' || it == 'u'
                || it == 'A' || it == 'E' || it == 'I' || it == 'O' || it == 'U')
    }

    // Check if input string doesn't have vowels, we're after the consonants
    val consonants = str?.filter { it ->
        (it != 'a' && it != 'e' && it != 'i' && it != 'o' && it != 'u'
                && it != 'A' && it != 'E' && it != 'I' && it != 'O' && it != 'U'
                && (it in 'a'..'z' || it in 'A'..'Z')
                && it.isLetter())
    }

    println("Vowels: $vowels")
    println("Consonants: $consonants")

}