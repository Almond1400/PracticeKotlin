import kotlin.random.Random

fun searchArrElIx(array: Array<Int>, elIx:Int): Int
{
    return array[elIx]
}

fun main()
{
    val array = Array(Random.nextInt(from = 5,until = 10), { Random.nextInt(from = 0,until = 999)})
    println("Массив: ")
    println(array.joinToString())

    println("Введите индекс искомого элемент")
    val el = readln().toInt()
    println("Этот элемент: ${searchArrElIx(array, el)}")
}