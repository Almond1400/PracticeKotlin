import kotlin.random.Random

fun main()
{
    val array = Array(Random.nextInt(from = 5,until = 15), { Random.nextInt(from = 0,until = 999)})

    var odd = arrayListOf<Int>()
    var honest = arrayListOf<Int>()

    for (i in array)
    {
        if (i % 2 != 0) {
            odd.add(i)
        }
        else {
            honest.add(i)
        }
    }
    println("Массив: ")
    println(array.joinToString())

    println("Все четные числа массива: ")
    for (i in honest)
    {
        print("$i ")
    }
    println()

    println("Все нечетные числа массива: ")
    for (i in odd)
    {
        print("$i ")
    }

}