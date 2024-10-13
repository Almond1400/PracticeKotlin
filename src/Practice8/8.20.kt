import kotlin.random.Random
fun arrayMaxEl(array: Array<Int>):Int
{
    var max = array[0]

    for (i in array)
    {
        if(i >= max)
            max = i
    }
    return max
}


fun main()
{
    val array = Array(10, { Random.nextInt(from = 0,until = 999)})

    println("Массив")
    println(array.joinToString())

    println("Максимальный элемент: ${arrayMaxEl(array)}")
}