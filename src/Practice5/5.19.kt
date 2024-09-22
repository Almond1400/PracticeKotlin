import kotlin.random.Random

fun arrayOutput(array: Array<Int>)
{
    for (i in 0..<array.size)
        print("${array[i]} ")
    println()
}

fun main()
{
    var array = arrayOf(
        Random.nextInt(from = 10,until = 99),
        Random.nextInt(from = 10,until = 99),
        Random.nextInt(from = 10,until = 99),
        Random.nextInt(from = 10,until = 99),
        Random.nextInt(from = 10,until = 99),
        Random.nextInt(from = 10,until = 99)
    )

    println("Изначальный массив: ")
    arrayOutput(array)

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

    println("Отсортированный массив: ")
    arrayOutput(array)
}