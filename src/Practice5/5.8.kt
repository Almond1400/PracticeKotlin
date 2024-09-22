fun main()
{
    println("Введите два числа")
    var a = readln().toInt()
    var b = readln().toInt()

    while ((a != 0) and  (b != 0))
    {
        if (a > b)
            a = a % b
        else
            b = b % a
    }
    println("НОД двух чисел: ${a + b}")
}