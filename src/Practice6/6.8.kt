import kotlin.random.Random

fun searchArrayElement(array: Array<Int>, el:Int): String
{
    var index = 0
    for (i in array)
    {
        if (i == el) {
            return index.toString()
        }
        index++
    }
    return "Элемент не найден"
}

fun main()
{
    val array = Array(Random.nextInt(from = 5,until = 10), { Random.nextInt(from = 0,until = 999)})
    println("Массив: ")
    println(array.joinToString())

    println("Введите искомый элемент")
    val el = readln().toInt()
    println("Индекс этого элемента в массиве: ${searchArrayElement(array, el)}")
}