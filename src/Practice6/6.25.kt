import kotlin.random.Random

fun main()
{
    val array = Array(5, { Random.nextInt(from = 1,until = 20)})
    println("Массив")
    println(array.joinToString())
    println("Введите искомый элемент")
    val el = readln().toInt()
    var search = false

    for (i in array)
    {
        if (i == el) {
            search = true
        }
    }

    if (search)
        println("Элемент найден!")
    else
        println("Элемент не найден")
}