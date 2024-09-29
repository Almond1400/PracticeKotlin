import kotlin.random.Random

fun main()
{
    var array = Array(5){ Random.nextInt(from = 1, until = 100)}
    println("Массив")
    println(array.joinToString())
    val arraySort = array.sortedArray()
    val med = arraySort[array.size/2]
    println("Медиана массива: $med")
}