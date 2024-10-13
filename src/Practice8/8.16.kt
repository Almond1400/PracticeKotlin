fun parity(a: Int):Boolean
{
    if (a % 2 != 0)
        return false
    else
        return true
}

fun main()
{
    println("Введите число")
    val a = readln().toInt()
    if (parity(a))
        println("Число четное")
    else
        println("Число нечетное")
}