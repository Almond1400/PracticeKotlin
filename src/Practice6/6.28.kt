fun main()
{
    println("Введите количество элементов")
    val arrayN = readln().toInt()
    val array = Array(arrayN, {0})

    println("Вводите элементы массива (через enter)")
    for (i in array.indices)
    {
        array[i] = readln().toInt()
    }

    println("Массив:")
    print(array.joinToString())
}
