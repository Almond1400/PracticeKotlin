import kotlin.random.Random

fun searchFirstEl(array: Array<Int>, el:Int): String
{
    var index = 0
    for (i in array)
    {
        if (i == el) {
            return index.toString()
        }
        index++
    }
    return "-1"
}

fun main()
{
    val array = Array(Random.nextInt(from = 5,until = 10), { Random.nextInt(from = 0,until = 10)})
    println("Массив: ")
    println(array.joinToString())

    println("Введите искомый элемент")
    val el = readln().toInt()
    println("Индекс первого вхождения элемента в массиве: ${searchFirstEl(array, el)}")
}