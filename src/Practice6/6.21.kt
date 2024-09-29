import kotlin.random.Random

fun main()
{
    val array = Array(Random.nextInt(from = 1,until = 20), { Random.nextInt(from = 1,until = 100)})

    println("Массив:")
    println(array.toMutableList())

    println("Введите индекс элемента, который хотите удалить")
    val delEl = readln().toInt()
    val list = array.toMutableList()
    list.removeAt(delEl)

    println("Массив:")
    println(list)
}