import kotlin.random.Random

fun main()
{
    val array = Array(Random.nextInt(from = 5,until = 15)) { Random.nextInt(from = 0, until = 999) }


    println("Массив: ")
    println(array.joinToString())

    println("Реверсированный массив:")
    println(array.reversedArray().joinToString())
}