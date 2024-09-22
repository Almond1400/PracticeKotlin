fun main()
{
    println("Введите три числа")
    var a = readln().toDouble()
    var b = readln().toDouble()
    var c = readln().toDouble()

    if ((a == b) or (a == c) or (b == c) )
    {
        println("Ошибка.")
    }
    else
    {
        if (((a > b) and (a < c)) or ((a < b) and (a > c)))
            println("$a - среднее число")
        else if (((b > a) and (b < c)) or ((b < a) and (b > c)))
            println("$b - среднее число")
        else
            println("$c - среднее число")

    }
}