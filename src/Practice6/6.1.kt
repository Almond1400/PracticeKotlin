import kotlin.random.Random
fun main()
{
    val array = arrayOf(Random.nextInt(from = 0,until = 999),
        Random.nextInt(from = 0,until = 999),
        Random.nextInt(from = 0,until = 999),
        Random.nextInt(from = 0,until = 999),
        Random.nextInt(from = 0,until = 999))


    println("Массив: ")
    println(array.joinToString())
}