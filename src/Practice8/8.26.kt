import kotlin.random.Random

fun arrayLastEl(array: Array<Int>): Int
{
    return array[array.size-1]
}

fun main()
{
    val array = Array(Random.nextInt(from = 1,until = 10), { Random.nextInt(from = 0,until = 999)})

    println("Массив:")
    println(array.joinToString())

    println("Последний элемент массива: ")
    println(arrayLastEl(array))
}