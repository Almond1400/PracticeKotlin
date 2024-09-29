import kotlin.random.Random

fun main()
{
    val array = Array(10, { Random.nextInt(from = 0,until = 999)})

    var max = array[0]
    var min = array[0]

    for (i in array)
    {
        if(i >= max)
            max = i
        if (i <= min)
            min = i
    }
    println("Массив")
    println(array.joinToString())

    println("Максимальный элемент: $max")
    println("Минимальный элемент: $min")
}