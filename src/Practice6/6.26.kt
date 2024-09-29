import kotlin.random.Random

fun main()
{
    val arrayN = Random.nextInt(from = 1,until = 20)
    val array = Array(arrayN, {Random.nextInt(from = 1,until = 100)})

    println("Массив:")
    println(array.joinToString())

    println("Среднее арифметическое в массиве: ${arraySum(array).toDouble()/arrayN.toDouble()}")
}