import kotlin.random.Random

fun main()
{
    val array = Array(100){ Random.nextInt(from = 1, until = 100)}
    println("Массив:")
    println(array.joinToString())

    var groupArray = Array(10) {Array(10){0} }
    var x = 0
    for (i in 0..<10)
    {
        for (j in 0..<10)
        {
            groupArray[i][j] = array[x]
            x++
        }
    }
    var i = 1
    for (arr in groupArray) {
        println("Группа $i:")
        for (value in arr) {
            print("$value ")
        }
        println()
        i++
    }
}