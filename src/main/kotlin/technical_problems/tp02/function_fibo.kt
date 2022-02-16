package technical_problems.tp02

fun fiboSum(n: Int): Int {
    var t1 = 0
    var t2 = 1
    var res = 0

    for (i in 1..n) {
        print("$t1 ")
        res += t1
        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }
    return res
}

fun main() {
    print("Enter number of Terms: ")
    val n: Int? = readLine()?.toIntOrNull()
    // 	var n = 45
    //  print("$n")
    if (n == null || n < 1) {
        println("Invalid Input")
    } else {
        val res = fiboSum(n)
        println("The sum is $res")
    }

}