fun main()
{
    println("Введите число")
    val num = readln().toDouble()
    println("Ведите степень")
    var degree = readln().toInt()
    var res = num
    if ((degree != 0) and (degree > 0)) {
        while (degree != 1)
        {
            res *= num
            degree--
        }
    }
    else if(degree < 0)
    {
        degree *= -1
        while (degree != 1)
        {
            res *= num
            degree--
        }
        res = 1/res
    }
    else
        res = 1.0

    println("Результат: $res")
}