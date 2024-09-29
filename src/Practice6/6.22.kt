import kotlin.random.Random

fun main()
{
    val array = Array(10, { Random.nextInt(from = 0,until = 999)})

    var max = array[0]
    var max2 = array[0]

    for (i in array)
    {
        if(i >= max)
            max = i
        if ((max > i) and (max2 <= i))
            max2 = i
    }
    println("Массив")
    println(array.joinToString())

    println("Максимальный элемент: $max")
    println("Второй максимальный элемент: $max2")
}