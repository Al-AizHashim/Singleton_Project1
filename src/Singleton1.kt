object Singleton  {
    init {
        println("Singleton class is invoked")
    }
    var name="Kotlin object"
    fun printName(){
        println(name)
    }
}
class A {
    init {
        println("Class init method. Singleton name property : ${Singleton.name}")
        Singleton.printName()
    }
}
fun main(args: Array<String>) {
    Singleton.printName()
    Singleton.name = "kk"
    var a = A()
}
