fun main()
{
    println("Введите диапозон от 1 до N")
    val n = readln().toInt()
    var sumEven = 0
    var sumOdd = 0

    for (i in 1..n)
    {
        if (i % 2 != 0)
            sumOdd += i
        else
            sumEven += i
    }
    println("Сумма четных чисел: $sumEven. Сумма нечетных чисел: $sumOdd")

}