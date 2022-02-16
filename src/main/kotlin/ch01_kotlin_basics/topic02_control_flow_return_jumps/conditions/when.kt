package ch01_kotlin_basics.topic02_control_flow_return_jumps.conditions

fun main(){
    val x : Int = 10
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> {
            print("x is neither 1 nor 2")
        }
    }

}