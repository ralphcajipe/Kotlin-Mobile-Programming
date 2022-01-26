package control_flow.conditions

fun main(){
    val a : Int = 5
    val b : Int = 10

    val max = if (a > b) {
        print("Choose a")
        a
    } else {
        print("Choose b")
        b
    }

}