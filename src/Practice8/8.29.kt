import kotlin.random.Random
fun arrMinMax(array: Array<Int>)
{
    var max = array[0]
    var min = array[0]

    for (i in array)
    {
        if(i >= max)
            max = i
        if (i <= min)
            min = i
    }

    println("Максимальный элемент: $max")
    println("Минимальный элемент: $min")
}


fun main()
{
    val array = Array(10, { Random.nextInt(from = 0,until = 999)})
    println("Массив")
    println(array.joinToString())
    arrMinMax(array)
}