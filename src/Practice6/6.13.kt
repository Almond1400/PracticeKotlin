import kotlin.random.Random

fun main()
{
    val array = Array(20, { Random.nextInt(from = 1,until = 100)})
    println(array.joinToString())
}