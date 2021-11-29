class Pila<T>() {
    private var list = mutableListOf<T>()

    constructor(element: Collection<T>) : this() {
        this.list = element.toMutableList()
    }

    fun top(): T? = if (list.size > 0) list[0] else null

    fun push(param: T) = list.add(0, param)

    fun pop(): Boolean = if (list.size > 0) list.remove(list[0]) else false

    fun isEmpty(): Boolean = list.isEmpty()

    fun size(): Int = list.size

    fun toList(): List<T> = list.toList()

    fun toMutableList(): MutableList<T> = list

    fun toSet(): Set<T> = list.toSet()

    fun toMutableSet(): MutableSet<T> = list.toMutableSet()

    override fun toString(): String {
        return list.toString()
    }
}


fun <T> reverse(list: List<T>): List<T> {
    val pila = Pila<T>()
    iterator<T> {  }
    list.forEach{ pila.push(it) }
    return pila.toList()

}


fun main() {

    var numbers = listOf("one", "two", "three", "four")
    var numbersRev = reverse(numbers)
    if (!listOf("four", "three", "two", "one").equals(numbersRev))
        println("Error")
    else
        println("Correcto")
    println(numbersRev)

}