fun kr100(x: Int):Boolean
{
    if (x % 100 != 0)
        return false
    else
        return true
}

fun main()
{
    println("Введите число")
    val x = readln().toInt()
    println("Результат: ${kr100(x)}")
}