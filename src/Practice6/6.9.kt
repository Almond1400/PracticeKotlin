import kotlin.random.Random

fun main()
{
    val array = Array(Random.nextInt(from = 5,until = 10), { Random.nextInt(from = 0,until = 999)})

    println("Оригинальный массив: ")
    println(array.joinToString())

    var copyArray = Array(array.size, {0})

    for (i in array.indices)
        copyArray[i] = array[i]
    println("Скопированный массив: ")
    println(copyArray.joinToString())
}