

class Pila<T>(list: List<T>){
    val list = list.toMutableList()

    fun tope():T? = if (list.size>0) list.first() else null

    fun push(param:T) = list.add(param)

    fun pop(param:T):Boolean = list.remove(list.first())

    fun empty():Boolean = list.isEmpty()

    override fun toString(): String {
        return list.toString()
    }
}






fun main() {

    val a = Pila<Int>(2,3,4)
}