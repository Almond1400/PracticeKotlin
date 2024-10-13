import kotlin.random.Random

fun arraySort2(array: Array<Int>): Array<Int>
{
    var tmp = 0
    for (i in 1..<array.size)
        for (j in 1..<(array.size))
        {
            if(array[j-1] > array[j]) {
                tmp = array[j-1]
                array[j-1] = array[j]
                array[j] = tmp
            }
        }
    return array
}

fun main()
{
    val array = Array(Random.nextInt(from = 1,until = 10), { Random.nextInt(from = 0,until = 999)})

    println("Изначальный массив:")
    println(array.joinToString())

    println("Отсортированный массив: ")
    println(arraySort2(array).joinToString())
}