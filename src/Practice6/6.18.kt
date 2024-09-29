import kotlin.random.Random

fun main()
{
    val array = Array(30, { Random.nextInt(from = 1,until = 100)})

    for (i in array.indices)
    {
        if((i+1) % 5 != 0)
            print("${array[i]} ")
        else {
            print("${array[i]} ")
            println()
        }
    }
}