import kotlin.random.Random

fun reverseArr(array: Array<Int>):Array<Int>
{
    var reArray = Array(array.size){0}
    var i = array.size-1
    var j = 0
    while (i >= 0)
    {
        reArray[j] += array[i]
        i--
        j++
    }

    return reArray
}


fun main()
{
    val array = Array(10, { Random.nextInt(from = 0,until = 999)})
    println("Массив")
    println(array.joinToString())
    println("Перевернутый массив")
    println(reverseArr(array).joinToString())
}