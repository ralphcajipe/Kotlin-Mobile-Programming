package technical_formative.m2_classes_objects

/**
 * Classes and Inheritance
 * Given the Pet as the parent class of the Cat, Dog, and Fish.
 * Complete the code so that each instance of Cat, Dog and Fish can
 * show their information and action as given.
 *
 * Cat -> meow
 * Dog -> barks
 * FIsh -> swim
 */

/**
open class _________________ {
val petName = name
val petColor = color
_________ displayAction(){}
fun displayInfo(action: String){
println("A pet named $petName with color $petColor do $action")
}
}

class Cat (___________________) : Pet(name, color) {
override fun displayAction(){
displayInfo("meow")
}
}

____________

____________

fun main(){
Cat("Garfield","Orange").displayAction()
Dog("Pluto","Black").displayAction()
Fish("Jenny","Gold").displayAction()
}

 */

open class Pet(name: String, color: String) {
    val petName = name
    val petColor = color
    open fun displayAction() {}
    fun displayInfo(action: String) {
        println("A pet named $petName with color $petColor do $action")
    }
}

class Cat(name: String, color: String) : Pet(name, color) {
    override fun displayAction() {
        displayInfo("meow")
    }
}


class Dog(name: String, color: String) : Pet(name, color) {
    override fun displayAction() {
        displayInfo("barks")
    }
}


class Fish(name: String, color: String) : Pet(name, color) {
    override fun displayAction() {
        displayInfo("swim")
    }
}

fun main() {
    Cat("Garfield", "Orange").displayAction()
    Dog("Pluto", "Black").displayAction()
    Fish("Jenny", "Gold").displayAction()
}
