import kotlin.random.Random

fun main()
{
    val array = Array(5, { Random.nextInt(from = 0,until = 15)})
    println("Массив:")
    println(array.joinToString())

    println("Введите индексы двух элементов, которые вы хотите поменять местами")
    val iEl1 = readln().toInt()
    val iEl2 = readln().toInt()

    var tmp = array[iEl1]
    array[iEl1] = array[iEl2]
    array[iEl2] = tmp

    println("Массив:")
    println(array.joinToString())
}