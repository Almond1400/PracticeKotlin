import kotlin.random.Random

fun main()
{
    val array = Array(Random.nextInt(from = 5,until = 10), { Random.nextInt(from = 0,until = 99)})
    var sumHonest = 0

    println("Массив:")
    println(array.joinToString())

    for (i in array)
    {
        if (i % 2 != 0)
            continue
        else
            sumHonest += i
    }
    println("Сумма всех его четных чисел: $sumHonest")
}