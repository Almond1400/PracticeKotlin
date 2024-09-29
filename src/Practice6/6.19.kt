import kotlin.random.Random

fun main()
{

    val array1 = Array(5, { Random.nextInt(from = 1,until = 100)})
    val array2 = Array(5, {Random.nextInt(from = 1,until = 100)})
    array1.sort()
    array2.sort()
    println("Первый отсортированный массив")
    println(array1.joinToString())
    println("Второй отсортированный массив")
    println(array2.joinToString())

    println("Объединенный отсортированный массив")
    val arrayfull = (array1+array2)

    println(arrayfull.sorted().joinToString())
}