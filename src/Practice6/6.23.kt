import kotlin.random.Random

fun unitedArray(vararg Arrays: Array<Int>)
{
    var unitedArray = emptyArray<Int>()

    for (arr in Arrays)
    {
        unitedArray += arr
    }
    println(unitedArray.joinToString())
}

fun main()
{
    val array1 = Array(5, {Random.nextInt(from = 1,until = 100)})
    val array2 = Array(5, {Random.nextInt(from = 1,until = 100)})
    val array3 = Array(5, {Random.nextInt(from = 1,until = 100)})
    println("1 массив")
    println(array1.joinToString())
    println("2 массив")
    println(array2.joinToString())
    println("3 массив")
    println(array3.joinToString())

    println("Объединенный массив")
    unitedArray(array1, array2, array3)
}