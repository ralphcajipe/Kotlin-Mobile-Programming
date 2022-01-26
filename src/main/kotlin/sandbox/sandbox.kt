fun main(args: Array<String>) {
    val input = readLine()!!.toString()
    val chars = input.toCharArray()
    var sum = 0
    for (i in chars.indices) {
        val int = chars[i].toString().toInt()
        sum += chars[i].toString().toInt()
    }
    val ave = sum / chars.size.toDouble()
    print("$sum %.2f".format(ave))
}