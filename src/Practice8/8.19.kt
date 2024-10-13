import kotlin.random.Random
fun arraySum2(array: Array<Int>):Int
{
    var sum = 0
    for (i in array)
        sum += i

    return sum
}

fun main()
{
    val array = Array(Random.nextInt(from = 1,until = 10), { Random.nextInt(from = 0,until = 999)})

    println("Массив: ")
    println(array.joinToString())

    println("Сумма всех элементов массива: ")
    arraySum2(array)
}