fun main()
{
    println("Введите три числа")
    var a = readln().toDouble()
    var b = readln().toDouble()
    var c = readln().toDouble()

    if (a > b)
        if(a > c)
            println("$a - максимальное число")
        else
            println("$c - максимальное число")
    else
        if (b > c)
            println("$b - максимальное число")
        else
            println("$c - максимальное число")
}