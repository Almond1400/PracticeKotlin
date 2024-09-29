import kotlin.random.Random

fun main()
    {
        val array = Array(5, { Random.nextInt(from = 1,until = 100)})
        println("Массив:")
        println(array.joinToString())

        println("Все числа Прокопенко в массиве:")
        for (i in array)
            if (i % 3 != 0)
                continue
            else
                print("$i ")
    }