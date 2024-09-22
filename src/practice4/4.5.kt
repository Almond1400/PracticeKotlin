fun main()
{
    println("Введите число")
    val num = readln().toInt()

    var t = true
    if (num < 0)
        t = false
    
    when (t)
    {
        true -> println("Знак числа = '+'")
        false -> println("Знак числа = '-'")
    }
}