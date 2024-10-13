import kotlin.random.Random

fun copyArray(array: Array<Int>): Array<Int>
{
    var copyArray = Array(array.size, {0})

    for (i in array.indices)
        copyArray[i] = array[i]
    return  copyArray
}

fun main()
{
    val array = Array(Random.nextInt(from = 5,until = 10), { Random.nextInt(from = 0,until = 999)})

    println("Оригинальный массив: ")
    println(array.joinToString())

    println("Скопированный массив: ")
    println(copyArray(array).joinToString())
}