

class Pila<T>(){
    private var list = mutableListOf<T>()

    constructor(list: List<T>):this(){
        this.list = list.toMutableList()
    }

    fun top():T? = if (list.size>0) list.first() else null

    fun push(param:T):Boolean = list.add(param)

    fun pop(param:T):Boolean = if (list.size>0) list.remove(list.first()) else false

    fun isEmpty():Boolean = list.isEmpty()

    fun size():Int = list.size

    override fun toString(): String {
        return list.toString()
    }
}


fun <T> reverse(list: List<T>):List<T>{
    val queue = Pila<T>()
    val value = mutableListOf<T>()
    list.reversed().forEach { queue.push(it) }
    list.

}



fun main() {




}