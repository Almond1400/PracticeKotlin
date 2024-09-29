    fun main()
{
    println("Введите число N")
    val n = readln().toInt()
    var sigma = 0

    for (i in 1.. n)
    {
        sigma += i*i
    }
    println("Сумма квадратов числа:$sigma")
}