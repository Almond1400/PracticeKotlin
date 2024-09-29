import kotlin.random.Random

fun main()
{

    val array1 = Array(5, { Random.nextInt(from = 1,until = 100)})
    val array2 = Array(5, {Random.nextInt(from = 1,until = 100)})
    println("Первый массив")
    println(array1.joinToString())
    println("Второй массив")
    println(array2.joinToString())

    println("Объединенный массив")
    val arrayfull = array1 + array2

    println(arrayfull.joinToString())
}