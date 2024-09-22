fun main()
{
    println("Введите число")
    val nZ = readln().toInt()
    println("Угадай число")
    val nP = readln().toInt()

    when(nP)
    {
        nZ -> println("Вы угадали!")
        else -> println("Вы не угадали.")
    }
}