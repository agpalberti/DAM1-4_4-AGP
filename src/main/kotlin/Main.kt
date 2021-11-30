class Pila<T>() {
    private var list = mutableListOf<T>()

    constructor(element: Collection<T>) : this() {
        this.list = element.toMutableList()
    }

    fun top(): T? = if (list.size > 0) list[0] else null

    fun push(element: T) = list.add(0, element)

    fun pop(): Boolean = if (list.size > 0) list.remove(list[0]) else false

    fun isEmpty(): Boolean = list.isEmpty()

    fun isNotEmpty(): Boolean = list.isNotEmpty()

    fun size(): Int = list.size

    fun toList(): List<T> = list.toList()

    fun toMutableList(): MutableList<T> = list

    fun toSet(): Set<T> = list.toSet()

    fun toMutableSet(): MutableSet<T> = list.toMutableSet()

    fun set(index:Int,element:T) = list.set(index,element)

    fun get(index: Int):T = list[index]

    fun hasNext():Boolean = list.size > 1

    override fun toString(): String {
        return list.toString()
    }
}


fun <T> reverse(list: List<T>): List<T> {
    val pila = Pila<T>()
    val iterator = list.iterator()
    val newList = mutableListOf<T>()
    while(iterator.hasNext()) pila.push(iterator.next())
    //return pila.toList()
    while (pila.isNotEmpty()){
        pila.top()?.let { newList.add(it) }; pila.pop() }
    return newList

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