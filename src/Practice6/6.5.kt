import kotlin.random.Random

fun main()
{
    val array = Array(5) { Random.nextInt(from = 0, until = 20) }
    println("Массив")
    println(array.joinToString())

    println("Уникальные элементы: ")
    var uni = false
    for (i in array.indices)
    {
        var uni = true
        for (j in array.indices)
        {
            if ((i != j) and (array[i] == array[j])) {
                uni = false
                break
            }
        }
        if (uni)
            print("${array[i]} ")
    }
}