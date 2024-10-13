

fun main()
{
    println("Введите N")
    val n = readln().toInt()

    println("Все простые числа до N: ")
    for (i in 1..n)
    {
        if (prostNumEx(i)) //Эта функция была создана в восьмой практике в 8.18.
            print("$i ")
        else
            continue
    }

}