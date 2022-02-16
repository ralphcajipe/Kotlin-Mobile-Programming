package ch01_kotlin_basics.topic02_control_flow_return_jumps.conditions

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