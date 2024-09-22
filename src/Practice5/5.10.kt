fun main()
{
    println("Введите число")
    var n = readln().toInt()
    var dig = 0
    var sum = 0

    while (n > 0)
    {
        dig = n % 10
        sum += dig
        n /= 10
    }
    println("Суммы цифр в числе: $sum")
}