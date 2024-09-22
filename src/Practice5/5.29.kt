fun main()
{
    println("Введите число N")
    val n = readln().toInt()
    var sum = 0.0
    for (i in 1.. n)
    {
        sum += 1/i.toDouble()
    }
    println("Сумма ряда: $sum")
}