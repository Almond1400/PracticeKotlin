fun main()
{
    println("Введите два числа")
    var a = readln().toInt()
    var b = readln().toInt()

    if (a % 2 != 0) {
        if (b % 2 != 0)
            println("Ошибка. Числа имеют одинаковую четность")
        else
            println("Нечетное число: $a")
    }
    else
    {
        if (b % 2 != 0)
            println("Нечетное число: $b")
        else
            println("Ошибка. Числа имеют одинаковую четность")
    }

}